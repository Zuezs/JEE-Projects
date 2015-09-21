package com.eintern.struts.pizzaorderingapp.action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class OrderHistoryForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if((name == null) || (name.isEmpty())){
			errors.add("name", new ActionMessage("error.name.required"));
		}
		
		
		return errors;
	}
	
	
}
