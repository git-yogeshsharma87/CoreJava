package com.practice.exceptionhandling;

public class ExceptionHandlingDemo2 {

	static int balance = 1000;
	
	public static void main(String[] args) {
		
		transaction(10);
		transaction(0);
		transaction(20);
		
		System.out.println("---------------");
		strLengthCalculator(null);
		strLengthCalculator("Today is a good day ! ");
		System.out.println("---------------");
		numberConvertor("435446");
		numberConvertor("435sbc");
		numberConvertor("3546");

	}

		private static void transaction(int amount) {
			
			try {
				float result = balance /amount ;
				System.out.println("Result Amount :> "+ result);
			} catch (ArithmeticException e ) {
				System.err.println("Exception occurs "+ e.getClass());
				System.err.println("Exception message "+ e.getMessage());
			}
		}
		
		private static void strLengthCalculator(String str) {
			try {
			int length = str.length();
			System.out.println("Input String Length : "+ length);
			}
			catch (NullPointerException e) {
				System.err.println("Exception occurs "+ e.getClass());
				System.err.println("Exception message "+ e.getMessage());
			}
		}
		
		private static void numberConvertor(String input) {
			try {
				int result = Integer.parseInt(input);
				System.out.println(" Integer result :> "+result);
			}catch(NumberFormatException e ){
				System.err.println("Exception occurs "+ e.getClass());
				System.err.println("Exception message "+ e.getMessage());

				
			}
			
			
		}
}
