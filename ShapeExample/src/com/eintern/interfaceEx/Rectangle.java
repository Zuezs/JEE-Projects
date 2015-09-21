package com.eintern.interfaceEx;

public class Rectangle implements Shapes {

	double width, height;
	@Override
	public float area(float... fs) {
		double area;
		
		area = this.width * this.height;
		
		return (float) area;
	}

}
