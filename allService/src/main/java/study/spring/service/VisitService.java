package study.spring.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import study.spring.entity.Visit;
import study.spring.entity.User;
import study.spring.repository.UserRepository;
import study.spring.repository.VisitRepository;
import study.spring.repository.VisitRepository;

//@Service
public class VisitService {
    @Autowired
    private VisitRepository visitRepo;
    @Autowired
    private UserRepository userRrepo;

    public String add(String Place) {
        try {
  //          User user = userRrepo.findByLogin(login).get();
            Visit visit = new Visit();
            
  //          user.addVisit(visit_id);
  //          userRrepo.save(user);
            return "success.update";
        } catch (Exception d) {
            System.err.println(d.getMessage());
            return "success.failure";
        }
    }

    public String delete(Integer visit_id) {
//        User user = userRrepo.findById(id).get();        
        try {
            Visit visit = null;
//            List<visit> visits = visitRepo.findAll();
//            outer:
//            for (visit c : visits) {
//                if (c.getvisitName().equals(visit.Place)) { 
//                    for (User u : c.getUsers()) {
//                        if (u.getUserId().equals(user.getUserId())) {
//                            visit = c;
//                            break outer;
//                        }
//                    }
//                }
//            }
            
//            if (visit != null) {                      
//                user.removevisit(visit);                               
//                userRrepo.save(user);
//                visitRepo.delete(visit);
//                return "success.deleted";
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "delete.failure";
    }
    
    public Set<Visit> getAllVisits() {
        return new HashSet<Visit>(visitRepo.findAll());
    }
    
}
