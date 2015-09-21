package com.eintern.spring.hellospringjersey.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Gift {
	@Id
	@GeneratedValue(generator="seq_giftid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_giftid",sequenceName="seq_giftid")
	private long id;
	
	@Column
	private String sender;
	
	@Column
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
