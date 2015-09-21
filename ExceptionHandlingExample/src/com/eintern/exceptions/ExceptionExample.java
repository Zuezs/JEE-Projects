package com.eintern.exceptions;

public class ExceptionExample {

	public boolean test(){
			
		
		try{
			int num1 = 10;
			int num2 = 5;
		
			int result = num1 / num2;
			
			int [] nums = {23,21,33,12,19};
		
			System.out.println(result);
			System.out.println(nums[5]);
			
			System.out.println("closing file");
			
			return true;
			
			
		}
		catch(ArithmeticException exception)
		{
			System.out.println("Cannot divide by zero. Please check the denominator");
			//exception.printStackTrace();
			return false;
		}
		catch(ArrayIndexOutOfBoundsException aioobException)
		{
			System.out.println("Index is out of bounds");
			//aioobException.printStackTrace();
			return false;
		}
		catch(Exception exception)
		{
			System.out.println("Some other exception");
			return false;
		}
		
		finally{
			System.out.println("Close a resource such as a file or database connection");
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionExample example1 = new ExceptionExample();
		boolean flag = example1.test();
		System.out.println(flag);
	}
	
	
}
