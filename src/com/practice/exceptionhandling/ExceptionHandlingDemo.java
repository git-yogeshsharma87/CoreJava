package com.practice.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Program initiated ! ");
		
		try {
		int balance  = 2000;
		
		int amount = 0;
	
		int result = balance /amount;
		
		System.out.println("Result avg balance: "+ result);
		} catch (Exception e) {
			System.err.println("Exception Occured and handled !");
		}
		finally {
			System.out.println("Always execute ! ");
		}
		
		System.out.println("Program Terminated ");
		
	}

}
