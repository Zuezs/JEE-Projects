package com.eintern.interfaceEx;

public class Circle implements Shapes {

	
	float radius = 0, area;
	float PI = (float) 3.14;
	
	@Override
	public float area(float... fs) {
		
		this.area = this.radius * this.radius * this.PI;
		
		return area;
	}

}
