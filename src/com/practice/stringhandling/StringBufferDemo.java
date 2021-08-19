package com.practice.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {

		// mutable string
		StringBuffer message = new StringBuffer("Today is a good day");
		
		//modify string using append new string text
		
		message.append(" Happy Learning");
		
		System.out.println(message);
		
		// replace text 
		
		message.replace(0, 1, "toMd");
		System.out.println(message);
		
		//delete text
		message.delete(0, 2);
		System.out.println(message);
		
	}

}
