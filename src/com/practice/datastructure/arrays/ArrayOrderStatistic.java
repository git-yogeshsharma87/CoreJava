package com.practice.datastructure.arrays;

import java.util.Arrays;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {
		// identify kth smalled and largest element
		int[] items = {-15,20,24,50,26,78,90};
		//Kth smallest element 
		//kth largest element
		int pos = 3;
		int result = findKthSmallest(items,pos);
		
		System.out.println("The pos " +pos +" based smallest element "+result);
		//kth largest element
		
int result2 = findKtheLargest(items,pos);
		
		System.out.println("The pos " +pos +" based largest element "+result2);
	}

	private static int findKthSmallest(int[] items, int pos) {
		
		//sort an array in ascending order 
		Arrays.sort(items);
		
		//return kth smallest
		
		
		return items[pos-1];
	}

	private static int findKtheLargest(int[] items, int pos) {
		
		//sort an array in ascending order 
		Arrays.sort(items);

		
		//return kth largest
		
		
		return items[items.length-pos];
	}
}
