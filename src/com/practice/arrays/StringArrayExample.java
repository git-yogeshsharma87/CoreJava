package com.practice.arrays;

public class StringArrayExample {

	public static void main(String[] args) {

		
		String[] names= {"John", "Mike", "David","William","Tony"};
		
		System.out.println("Name at index 0 : "+ names[0]);
		System.out.println("Name at index 4 : "+ names[4]);
		//System.out.println("Name at index 5 : "+ names[5]);
		//5th element will give array index out of bound exception
		
		for(int index=0; index <names.length;index++ ) {
			
			System.out.println("Names at index : "+index +" has name "+names[index]);
		}
		
	}

}
