package com.practice.regex;

import java.util.regex.Pattern;

public class RegExPatternExample {

	public static void main(String[] args) {

		System.out.println(Pattern.matches(".n", "^n")); // true. First char can be any value and second chat should ne "n"
		System.out.println(Pattern.matches(".m", "Ymm")); // false - only 2 char allowed
		System.out.println(Pattern.matches(".m", "Hx")); // false - second char should be 'm'
		System.out.println(Pattern.matches("..m", "Ynm")); // true - first 2 can be anything, third should be m
		System.out.println(Pattern.matches("..m", "Ynx")); // false - first 2 can be anything, third should be m
		System.out.println(Pattern.matches("n.", "nY")); // true - second char can be any value but first char should be n

		
	}

}
