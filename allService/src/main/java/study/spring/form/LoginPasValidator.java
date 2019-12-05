package study.spring.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import study.spring.entity.User;
import study.spring.repository.UserRepository;

@Service
public class LoginPasValidator implements Validator {

	@Autowired
    private UserRepository userRepo;

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginForm loginForm = (LoginForm) target;
        String log = loginForm.getLogin();
        String pass = loginForm.getPassword();

        if (log == null || log.isEmpty()) {
            errors.rejectValue("login", "notEmpty");
        }

        if (pass == null || pass.isEmpty()) {
            errors.rejectValue("password", "notEmpty");
        } else {
            User user = userRepo.findByLogin(log);
            if (user == null) {
                errors.rejectValue("password", "Wrong.password");
            } else if (!user.getLogin().equals(log)) {
                errors.rejectValue("userName", "Wrong.userName");
            }
        }
    }
}