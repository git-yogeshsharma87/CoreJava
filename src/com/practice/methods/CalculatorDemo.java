package com.practice.methods;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter 2 numbers for calculator : ");
		int x = input.nextInt();
		int y = input.nextInt();
		Calculator calc = new Calculator();
		/*
		 * int x = 5000; int y = 2000;
		 */
		System.out.println("X is : "+x+" Y is : "+y);
		System.out.println("Addition is : "+calc.add(x, y));
		System.out.println("Substraction is : "+calc.sub(x, y));
		System.out.println("Division is : "+calc.div(x, y));
		System.out.println("Multiplication is : "+Calculator.mul(x, y));
		System.out.println("Average is : "+Calculator.avg(x, y));
	}

}

class Calculator {
	
	// addition 
	public float add(int num1, int num2 ) {
		float result = num1 + num2;
		return result;
	}
	// substraction
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
	}
	
	// div
	public float div(int num1, int num2) {
		float result = num1 / num2;
		return result;}
	// multiplication
		public static float mul(int num1, float num2) {
			float result = num1 * num2;
			return result;}
	// average
			public static float  avg(float num1, float num2) {
				float result = (num1 + num2)/2;
				return result;}
		}
