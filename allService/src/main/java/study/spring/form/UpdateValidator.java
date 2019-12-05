package study.spring.form;


import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import study.spring.repository.*;
import study.spring.repository.UserRepository;
import study.spring.repository.VisitRepository;
import study.spring.entity.Visit;
import study.spring.entity.User;

import java.util.Set;

import javax.annotation.Resource;

//@Service
public class UpdateValidator implements Validator {

    @Resource(name = "userRepo")
    private UserRepository userRepo;
    @Resource(name = "visitRepo")
    private VisitRepository visitRepo;
    private String userPass, operation;

    public void setParameters(String userPass, String operation) {
        this.userPass = userPass;
        this.operation = operation;
    }

    @Override
    public boolean supports(Class clazz) {
        return UpdateForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UpdateForm updateForm = (UpdateForm) target;
        String name = updateForm.getVisitDate();
        if (name.isEmpty() || name.matches("\\p{Space}+") || name == null) {
            errors.rejectValue("visitName", "name.empty");
            return;
        }
        Visit visit = null;
  //      User user = userRepo.getRecords("password", userPass);
        switch (operation) {
            case "add":
               
                    visit = new Visit();
                    visit.setVisitDate(name);
//                    visit.setUser((Set<User>) user);
                    visitRepo.update(visit);
                    errors.rejectValue("visitName", "success.update");
                
                break;
            case "delete":
                try {
                    visit = visitRepo.getRecords("Place", name);
//           				if (!visit.getUser_id().equals(user_id)) {
//                        errors.rejectValue("visitName", "delete.not");
//                        return;
//                    }

//                    visitRepo.deleteRecords(visit);
                    errors.rejectValue("visitName", "success.deleted");
                } catch (NullPointerException e) {
                    errors.rejectValue("visitName", "delete.failure");
                }
                break;
        }
    }
}