package study.spring.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import study.spring.entity.User;
import study.spring.entity.Visit;

	public interface VisitRepository /*extends JpaRepository<Visit, Integer>*/ {
	    Visit findById(int visit_id);

		Object getAllRecords();

		Visit getRecords(String string, String pass);

		List<Visit> findAll();

		void update(Visit visit);
}
