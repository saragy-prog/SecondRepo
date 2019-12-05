package study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);
}