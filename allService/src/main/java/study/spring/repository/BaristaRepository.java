package study.spring.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import study.spring.entity.*;
  
public interface BaristaRepository /*extends JpaRepository<Visit, Integer>*/ {
    Barista findByBaristaName(String BaristaName);

	List<Visit> findAll();
}