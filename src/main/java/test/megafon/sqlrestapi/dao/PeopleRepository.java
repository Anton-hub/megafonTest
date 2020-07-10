package test.megafon.sqlrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.megafon.sqlrestapi.model.People;

public interface PeopleRepository extends JpaRepository<People, Integer> {
}
