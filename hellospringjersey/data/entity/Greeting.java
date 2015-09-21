package com.eintern.spring.hellospringjersey.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
@NamedNativeQueries({@NamedNativeQuery(name="findGreetingsForNameMoreThanThree", query="SELECT g.id, g.name, g.greeting FROM Greeting g JOIN (SELECT g.name FROM Greeting g group by g.name having count(g.name) > 3) q ON g.name = q.name", resultClass=Greeting.class)})
public class Greeting {
	@Id
	@GeneratedValue(generator="seq_greetingid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_greetingid",sequenceName="seq_greetingid")
	private long id;
	
	@Column
	@Size(min=2)
	private String name;
	
	@Size(min=2)
	@Column
	private String greeting;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + ", greeting="
				+ greeting + "]";
	}
}
