package com.eintern.jsf.calculator;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalcBean {

	@ManagedProperty(value="#{calcDaoImp}")
	private CalcDaoImp calcDaoImp = new CalcDaoImp();
	
	private Calculator calc = new Calculator();
	
	List<Calculator> list;

	
	public String calculate(){
		
		//Default page for not logging in correctly
		String nextPage = "main";
		
		if(calc.getType().equals("Add")){
			
			calc.setNumberOne(calc.getNumberOne());
			calc.setNumberTwo(calc.getNumberTwo());
			calc.setType(calc.getType());
			
			double result = calc.getResult();
			result = calc.getNumberOne() + calc.getNumberTwo();
			
			calc.setResult(result);
			
			calcDaoImp.addCalcBean(calc);
		}
		if(calc.getType().equals("Subtract")){
			
			calc.setNumberOne(calc.getNumberOne());
			calc.setNumberTwo(calc.getNumberTwo());
			calc.setType(calc.getType());
			
			double result = calc.getResult();
			result = calc.getNumberOne() - calc.getNumberTwo();
			
			calc.setResult(result);
			
			calcDaoImp.addCalcBean(calc);
		}
		if(calc.getType().equals("Divide")){
			
			calc.setNumberOne(calc.getNumberOne());
			calc.setNumberTwo(calc.getNumberTwo());
			calc.setType(calc.getType());
			
			double result = calc.getResult();
			result = calc.getNumberOne() / calc.getNumberTwo();
			
			calc.setResult(result);
			
			calcDaoImp.addCalcBean(calc);
		}
		if(calc.getType().equals("Multi")){
			
			calc.setNumberOne(calc.getNumberOne());
			calc.setNumberTwo(calc.getNumberTwo());
			calc.setType(calc.getType());
			
			double result = calc.getResult();
			result = calc.getNumberOne() * calc.getNumberTwo();
			
			calc.setResult(result);
			
			calcDaoImp.addCalcBean(calc);
		}
		
		list = calcDaoImp.getCalculations();
		
		return nextPage;
	}
	
	public CalcDaoImp getCalcDaoImp() {
		return calcDaoImp;
	}

	public void setCalcDaoImp(CalcDaoImp calcDaoImp) {
		this.calcDaoImp = calcDaoImp;
	}

	public Calculator getCalc() {
		return calc;
	}

	public void setCalc(Calculator calc) {
		this.calc = calc;
	}

	public List<Calculator> getList() {
		return list;
	}

	public void setList(List<Calculator> list) {
		this.list = list;
	}
}
