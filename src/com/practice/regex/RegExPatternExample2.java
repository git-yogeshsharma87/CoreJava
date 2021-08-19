package com.practice.regex;

import java.util.regex.Pattern;

public class RegExPatternExample2 {

	public static void main(String[] args) {


		// one char match sequence 
		System.out.println(Pattern.matches("[xyz]", "a")); //false->it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "x")); //true->it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "xy")); //false->it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "xyz")); //false->it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "y")); //true->it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "Y")); //true->it matches one value out of x,y,z
		System.out.println("------------------------------------------------------------");
		// more than one char match sequence 
		System.out.println(Pattern.matches("[xyz][xyz]", "xy")); //true->

		System.out.println(Pattern.matches("[xyz][xyz]", "xyz")); //false-
		System.out.println(Pattern.matches("[xyz][xyz][xyz]", "xyz")); //true->

		
		System.out.println(Pattern.matches("[xyz][xyz][xyz]", "xy")); //false->
		
		System.out.println("------------------------------------------------------------");
		//more than one char sequence match 
		System.out.println(Pattern.matches("[xyz]+", "xy")); //true->matches one or more than one value out of xyz

		System.out.println(Pattern.matches("[xyz]+", "xyz")); //true->matches one or more than one value out of xyz

		System.out.println(Pattern.matches("[xyz]+", "xyx")); //true->matches one or more than one value out of xyz
		
		System.out.println("------------------------------------------------------------");

		System.out.println(Pattern.matches("[xyz]?", "xy")); //false->matches one or zero value out of xyz

		System.out.println(Pattern.matches("[xyz]?", "x")); //true->matches one or zero value out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "")); //false->matches one or zero value out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "")); //false->matches one or zero value out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "pqr")); //false->matches one or zero value out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "p")); //false->matches one or zero value out of x,y,z

		
		System.out.println("------------------------------------------------------------");

		System.out.println(Pattern.matches("[xyz]*", "xy")); //true->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "xy")); //true->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "xyxxyyzyx")); //true->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "xyxxyyzyxp")); //false->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "")); //true->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "azhar")); //false->matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "azhar")); //false->matches zero or more value match out of x,y,z

		System.out.println("------------------------------------------------------------");

		
		
		
	}

}
