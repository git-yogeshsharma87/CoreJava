package com.practice.datastructure.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {
		
		// ordered static data 
		
		int[] items = {10,20,30,40,50,60,70,80,90};

		displayOne(items);
		displayTwo(items);
		
	}



	// This method runs in O(1) -> Constant time complexity
	private static void displayOne(int[] items) {
		System.out.println(items[5]);
	}

	// This method runs in O(1+1) = O(2) => O(1) <- this is approximated to 1 as not much difference-> Constant time complexity

	private static void displayTwo(int[] items) {
		System.out.println(items[5]);
		System.out.println(items[1]);

	}
	
}
