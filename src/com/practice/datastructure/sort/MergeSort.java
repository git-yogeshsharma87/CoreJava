package com.practice.datastructure.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] inputs = {20,35,-15,5,55,2,-18};
		
		int start = 0;
		int end = inputs.length;
		
		System.out.println("Before : "+Arrays.toString(inputs));
		mergeSort(inputs,start,end);
		System.out.println("After  : "+Arrays.toString(inputs));
		
	}

	// Time complexity : O( log n) -> logarithmic time complexity
	private static void mergeSort(int[] inputs, int start, int end) {

		// breaking logic for recursion
		if(end-start <2) {
			return ;
		}
		
		
		// 1. divide array elements
		int mid = (start+end)/2;
		
		// 2. call mergeSort for first half
		mergeSort(inputs, start, mid);
		
		
		// 3. call mergeSort for second half
		mergeSort(inputs, mid, end);

		//4. call data merge with comparison
		
		merge(inputs,start,mid,end);
	}

	private static void merge(int[] inputs, int start, int mid, int end) {

		//breaking condition
		if(inputs[mid-1]<=inputs[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		//create temp array for sorted elements
		int[] temp = new int[end-start];
		
		//start comparison
		while(i<mid && j<end) {
			
			temp[tempIndex++] = (inputs[i]<=inputs[j]) ? inputs[i++] :inputs[j++];
		}
		
		//copy element from temp array to actual inputs array
		System.arraycopy(inputs, i, inputs, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, inputs, start, tempIndex);
		
	}

}
