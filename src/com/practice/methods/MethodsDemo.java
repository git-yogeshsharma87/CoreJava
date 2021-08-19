package com.practice.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// for non static method
		MethodsDemo demo = new MethodsDemo();
		demo.showMessage();
		demo.displayAuthor("John");
		demo.displayDetails("JS@gmail.com", "He is a full stack developer");
		MethodsDemo.showMessage();
		MethodsDemo.displayAuthor("Karrie");

		MethodsDemo.displayDetails("KM@gmail.com", "He is another full stack developer");
		
		
	}

	//user defined methods : 1) parameterized methods 2) non-parameterized methods 

	//non - parameterized method 
	public static void showMessage() {
		System.out.println(" This is non parameterized");
	}
	
	//one parameterized
	
	public static void displayAuthor(String name) {
		System.out.println("Auther is : "+ name);
	}
	
	//two parameters
	public static void displayDetails(String email,String description) {
		System.out.println("Author email is : "+email+"\n"+" and details are :"+description  );
	}
	
	
}
