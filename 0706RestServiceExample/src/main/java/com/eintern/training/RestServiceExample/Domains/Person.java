package com.eintern.training.RestServiceExample.Domains;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
	Code in XML should look like this
	
	<person>
		<person_id>1</person_id>
		<first_name>Ty</first_name>
		<last_name>Allen</last_name>
	</person>


*/

@XmlRootElement(name="person")
@XmlAccessorType(value=XmlAccessType.FIELD)
public class Person {

	@XmlElement(name="person_id")// name is not Mandatory
	private int personID;
	@XmlElement(name="first_name")
	private String FirstName;
	@XmlElement(name="last_name")
	private String LastName;
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
}
