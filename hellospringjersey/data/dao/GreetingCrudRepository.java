package com.eintern.spring.hellospringjersey.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eintern.spring.hellospringjersey.data.entity.Greeting;

@Repository
public interface GreetingCrudRepository extends CrudRepository<Greeting, Long> {
	@Query("FROM Greeting g WHERE g.name = :name")
	public Iterable<Greeting> findAllByName(@Param("name") String name);
}
