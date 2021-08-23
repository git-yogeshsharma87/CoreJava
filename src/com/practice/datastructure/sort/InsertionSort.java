package com.practice.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] inputs = {20,35,-15,5,55,2,-18};
		System.out.println("Before : "+Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After  : "+Arrays.toString(inputs));
		
	}

	private static void insertionSort(int[] inputs) {

		// start sorting from second element of list considering first as sorted
		for(int firstUnsortedIndex = 1;firstUnsortedIndex <inputs.length;firstUnsortedIndex++) {
			System.out.println("first unsorted index : "+firstUnsortedIndex);
			int element = inputs[firstUnsortedIndex];
			int index;
			//comparison
			for(index=firstUnsortedIndex;index > 0 && inputs[index-1]>element;index--) {
				System.out.println("Index : "+index);

				inputs[index] =inputs[index-1];
			}
			inputs[index] = element;
		}
		
		
		
	}

}
