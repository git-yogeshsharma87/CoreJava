package com.practice.datastructure.search;

public class LinearSearchTest {

	public static void main(String[] args) {
		
		int[] items = {20, 50, 35, -15, 7,1,55,-22};
		
		int searchValue = -15;
		
		
		int searchIndex =  linearSearch(items,searchValue);
		
		if(searchIndex >= 0) {
			System.out.println("The search element : "+ searchValue+ " is found at index " + searchIndex);
		}
		else {
			System.out.println("The Search Element : "+searchValue + "is not found in the list .");
		
		}

		
		
	}

	//This method will run in O(n)
	private static int linearSearch(int[] items, int searchValue) {
		int tries =0;
		// search through a complete array 
		for(int index = 0;index < items.length; index++) {
			 tries +=1;
			if(items[index]==searchValue) {
			System.out.println(" Found after tries : "+tries);
				return index;
			}
		}
		return -1;
	}

}
