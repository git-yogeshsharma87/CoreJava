package com.practice.exceptionhandling;

import java.io.IOException;

public class ThrowsExceptionDemo {

	// throws : throws keyword is used to declare exception
	public static void main(String[] args) {
		
		//calling method
		try{
			ageValidator(21);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

	//method declaration age validator 
	
	public static  void ageValidator(int age) throws IOException  {
		if (age > 20) {
			System.out.println("Valid age");
			
		}
		else {
			throw new IOException("Not a valid age ! ");
		}
	}
	
}
