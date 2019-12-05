package study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.spring.entity.User;
import study.spring.repository.UserRepository;

//@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    
    public User getUser(String login) {
        return repo.findByLogin(login);
    }
}
