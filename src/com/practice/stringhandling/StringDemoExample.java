package com.practice.stringhandling;

public class StringDemoExample {

	public static void main(String[] args) {

		
		
		
		
		
		//string literal 
		String str1 = "John";
		String str2 = "John"; // it doesn't create a new string here. Same value in heap String constant  pool
		
		if (str1 == str2 ) { // reference check
			
			System.out.println(" These are same strings as location is same in heap");
			
		}
		else {
			System.out.println("Different String");
		}
		
		//Strung by new keyword 
		
		String username1 = new String("John Smith");
		String username2 = new String("John Smith");
		
		if (username1 == username2) {
			System.out.println("Same");
			
		}else {
			System.out.println("Different");
		}
		
	}

}
