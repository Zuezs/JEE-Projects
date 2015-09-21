package com.eintern.spring.hellospringjersey.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eintern.spring.hellospringjersey.data.entity.MultiGreeting;

@Repository
public interface MultiGreetingCrudRepository extends CrudRepository<MultiGreeting, Long> {
	@Query("FROM MultiGreeting g WHERE g.name = :name")
	public Iterable<MultiGreeting> findAllByName(@Param("name") String name);
}
