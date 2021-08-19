package com.practice.accessmodifiers;
import com.practice.accessmodifiersB.SuperHero;

public class protectedAccessModifierTest extends SuperHero {

	public static void main(String[] args) {
		SuperHero superhero = new SuperHero();
		
		protectedAccessModifierTest accM = new protectedAccessModifierTest();
		System.out.println("The Number : " +accM.number);
		System.out.println("The Power : " + accM.power);
		
		
	}

}
