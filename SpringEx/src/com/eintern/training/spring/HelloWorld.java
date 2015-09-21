package com.eintern.training.spring;

import org.springframework.context.ApplicationContext;

public class HelloWorld implements Shape {
		private Point pointA;
		private Point pointB;
		private Point pointC;
		private ApplicationContext context = null;
				
		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw(){
			System.out.println("Drawing Triangle");
			System.out.println("Point A = (" + pointA.getX() + ", " + pointA.getY() + ")");
			System.out.println("Point B = (" + pointB.getX() + ", " + pointB.getY() + ")");
			System.out.println("Point C"
					+ " = (" + pointC.getX() + ", " + pointC.getY() + ")");
			
		}
		
		public void sayHiWorld(){
			System.out.println("Hi World!");
		}


		
}

