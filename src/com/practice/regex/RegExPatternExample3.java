package com.practice.regex;

import java.util.regex.Pattern;

public class RegExPatternExample3 {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-z]*", "azhar")); // true -> it matches 0 or more match out of a-z
		System.out.println(Pattern.matches("[a-z]*", "x")); // true -> it matches 0 or more match out of a-z

		System.out.println(Pattern.matches("[a-z]*", "")); // true -> it matches 0 or more match out of a-z
		System.out.println(Pattern.matches("[a-z]+", "x")); // true -> it matches 1 or more match out of a-z
		System.out.println(Pattern.matches("[a-z]+", "")); // false -> it matches 1 or more match out of a-z

		System.out.println(Pattern.matches("[a-z]+", "pqr")); // true -> it matches 1 or more match out of a-z
		
		System.out.println(Pattern.matches("[a-z]+", "azhar")); // true -> it matches 1 or more match out of a-z

		
		System.out.println(Pattern.matches("[A-Z]+", "x")); // false -> it matches 1 or more match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "XYZ")); // true -> it matches 1 or more match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "XYZ123")); // false -> it matches 1 or more match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "XYZxxx")); // false -> it matches 1 or more match out of A-Z

		System.out.println("-------------------------------------------");
		
		System.out.println(Pattern.matches("[a-zA-Z]+", "mknPQR")); // true -> it matches 1 or more match out of A-Z or a-z

		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mknPQR123")); // true -> it matches 1 or more match out of A-Z or a-z
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mknPQR")); // true -> it matches 1 or more match out of A-Z or a-z
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "54822")); // true -> it matches 1 or more match out of A-Z or a-z
		
		System.out.println("-----------------------------------------");
		// only digit
		System.out.println(Pattern.matches("\\d", "mkd")); // false -> it allows only digit 0-9
		System.out.println(Pattern.matches("\\d", "451884")); // false -> it allows only 1 digit 0-9
		System.out.println(Pattern.matches("\\d", "1")); // true -> it allows only digits 0-9
		System.out.println(Pattern.matches("\\d+", "564841")); // true -> it allows only digits 0-9
		//no digit
		System.out.println(Pattern.matches("\\D", "p")); // true -> donot allows  digits 0-9 in one char match
		System.out.println(Pattern.matches("\\D", "0")); // false -> donot allows  digits 0-9 in one char match
		System.out.println(Pattern.matches("\\D+", "sdfsdf")); // true -> donot allows  digits 0-9 in one char match


	}

}
