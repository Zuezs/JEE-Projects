package com.eintern.interfaceEx;

public class Triangle implements Shapes {

	double height, base;

	@Override
	public float area(float... fs) {
		
		double area;
		
		area = (this.height * this.base) / 2;
		
		return + (float) area;
	}
	
	
}
