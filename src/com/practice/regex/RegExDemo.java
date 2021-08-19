package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {

		//Step1 : define a data string 
		
		String data = "Pn";
		
		// Step2 : define a pattern 
		
		Pattern pattern = Pattern.compile(".n");
		
		// Step 3 : define a matcher 
		
		Matcher matcher = pattern.matcher(data);
		
		// Step4 : match the pattern with given input data 
		
		boolean result = matcher.matches();
		
		System.out.println("result : "+ result);
		
		//Shorter syntax 
		boolean result2 = Pattern.compile(".n").matcher(data).matches();
		System.out.println("Result 2 with shorten syntax is "+ result2);
		
		//shortest syntax
		
		boolean result3 = Pattern.matches(".n", data);
		System.out.println("Result 3 with shortest syntax is : "+ result3);
		
	}

}
