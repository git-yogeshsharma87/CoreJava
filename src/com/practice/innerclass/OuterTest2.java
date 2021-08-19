package com.practice.innerclass;

public class OuterTest2 {
	
	private static double  amount = 9234.234;
	public static String message = "Today is a good day";
	
	//inner class 
	static class InnerTest {
		
		private String message2 = " Hello, & Welcome";
		public void showData() {
			
			System.out.println("Outer class amount : "+ amount);
			System.out.println("Outer class message : "+ message);
			System.out.println("Inner class message : "+ message2);
		}
	}
			
	public static void main(String[] args) {
		
		//create outer class object 
		//OuterTest2 outer = new OuterTest2();
		// create inner class object from outer reference
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
	}		
}
