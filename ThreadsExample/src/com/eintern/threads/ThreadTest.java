package com.eintern.threads;

class RunLogic implements Runnable {

	
	public void run(){
		for(int i = 1; i < 10; i++){
			System.out.println("Thread " + Thread.currentThread().getName() + " Running!");
		}
	
	}
	
}
public class ThreadTest{
	
	public static void main(String[] args) {
		Thread first = new Thread(new RunLogic());
		Thread second = new Thread(new RunLogic(), " Davy ");

		first.start();
		second.start();
	}
}