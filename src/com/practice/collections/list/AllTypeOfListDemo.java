package com.practice.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {
		// Array List
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("Dell");
		listOfCompanies.add("Mahindra");
		listOfCompanies.add("Wipro");
		listOfCompanies.add("HCL");
		listOfCompanies.add("TCS");
		System.out.println(listOfCompanies);
		
		//Linked List 
		LinkedList<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("New Delhi");
		listOfCities.add("New Jersey");
		listOfCities.add("Mumbai");
		listOfCities.add("LA");
		System.out.println(listOfCities);
		
		
		//Vector 
		
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Mango");
		listOfFruits.add("Apple");
		listOfFruits.add("Grapes");
		listOfFruits.add("Banana");
		System.out.println(listOfFruits);
		
		
		
	}

}
