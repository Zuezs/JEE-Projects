package com.eintern.jsf.calculator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Calculator {

	@Id
	@GeneratedValue(generator="seq_numid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_numid",sequenceName="seq_numid", allocationSize=1)
	private long numId;
	private double numberOne;
	private double numberTwo;
	private double result;
	private String type;
	
	public long getNumId() {
		return numId;
	}
	public void setNumId(long numId) {
		this.numId = numId;
	}
	public double getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}
	public double getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
