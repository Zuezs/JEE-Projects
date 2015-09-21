package com.eintern.jsf.calculator;

import java.util.List;

public interface CalcDao {

	public void addCalcBean(Calculator calc);
	public List<Calculator> getCalculations(); 
}
