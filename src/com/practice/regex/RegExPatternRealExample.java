package com.practice.regex;

import java.util.regex.Pattern;

public class RegExPatternRealExample {

	public static void main(String[] args) {
//WAP for that accept alphanumeric characters only for username 
		//WAP for that accept alphanumeric characters but only length of 10
		//WAP for first name where only small alphabets allowed upto 6 chars
		//WAP for email where only small alphabets with numbers allowed upto 15 chars
		//WAP for email where only small alphabets with numbers and special char is allowed upto 15 chars

		
		//WAP for that accept alphanumeric characters only for username 

		String username = "azhar705";
		String regex1 = "[a-zA-z0-9]+";

		System.out.println(Pattern.matches(regex1, username));
		
//WAP for that accept alphanumeric characters but only length of 10
		String username2 = "Eva1234345";
		String regex2 = "[a-zA-z0-9]{10}";
		System.out.println(Pattern.matches(regex2, username2));

//WAP for first name where only small alphabets allowed upto 6 chars i.i 0-6 
		String firstname = "eva";
		String regex3  = "[a-z]{0,6}";
		System.out.println(Pattern.matches(regex3, firstname));
		
//WAP for email where only small alphabets with numbers allowed upto 15 chars
		
		String email = "azhar12gmailcom";
		String regex4 = "[a-z0-9]{0,15}";
		System.out.println(Pattern.matches(regex4, email));

//WAP for email where only small alphabets with numbers and special char is allowed upto 15 chars
		String email1 = "azhar12@gmail.com";
		String regex5 = "[a-z0-9]+.+@+.+{0,15}";
		String regex6 = "[a-z0-9]+.+@+.+{0,15}";

		System.out.println(Pattern.matches(regex6, email1));
		
	}

}
