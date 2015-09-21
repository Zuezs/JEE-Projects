package com.eintern.spring.hellospringjersey.data.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
@NamedNativeQueries({@NamedNativeQuery(name="findMultiGreetingsForNameMoreThanThree", query="SELECT g.id, g.name, g.greeting FROM Greeting g JOIN (SELECT g.name FROM Greeting g group by g.name having count(g.name) > 3) q ON g.name = q.name", resultClass=MultiGreeting.class)})
public class MultiGreeting {
	@Id
	@GeneratedValue(generator="seq_multigreetingid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_multigreetingid",sequenceName="seq_multigreetingid")
	private long id;
	
	@Column
	@Size(min=2)
	private String name;
	
	@Size(min=2)
	@ElementCollection
	private List<String> greetings;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MG_ID")
	private List<Gift> gifts;
	
	public MultiGreeting() {
		greetings = new ArrayList<>();
		gifts = new ArrayList<>();
	}
	
	public MultiGreeting(int len) {
		greetings = new ArrayList<>(len);
		gifts = new ArrayList<>(len);
		for(int i=0;i<len;++i) {
			greetings.add("");
			gifts.add(new Gift());
		}
	}
	
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

	public List<String> getGreetings() {
		return greetings;
	}

	public void setGreetings(List<String> greetings) {
		this.greetings = greetings;
	}
	
	public List<Gift> getGifts() {
		return gifts;
	}

	public void setGifts(List<Gift> gifts) {
		this.gifts = gifts;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + ", greeting="
				+ greetings + "]";
	}
}
