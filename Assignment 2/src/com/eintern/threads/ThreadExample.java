package com.eintern.threads;

	class RunLogic implements Runnable {

		
		public void run(){
			for(int i = 1; i < 25; i++){
				System.out.println("Thread " + Thread.currentThread().getName() + " Running!");
			}
		
		}
		
	}
	public class ThreadExample {
		
		public static void main(String[] args) {
			Thread first = new Thread(new RunLogic(), " Thrillz");
			Thread second = new Thread(new RunLogic(), " Mick Jagger");
			Thread third = new Thread(new RunLogic(), " Zuezs");

			first.start();
			second.start();
			third.start();
		}
}
	

