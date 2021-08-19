package com.practice.stringhandling;

public class StringImmutability {

	public static void main(String[] args) {

		// Strings are immutable in Java. That means unmodifiable or unchangeable values.
		
		String username = "John";
		username.concat(" Snow"); // update String but won't happen as string is immutable
		
		System.out.println(username);
		
		
		String username1 = new String("John");
		username1.concat(" Snow");
		
		System.out.println(username1);
		
		// to change , create a new string variable
		String response = username.concat(" Snow");
		System.out.println(response);

		
	}

}
