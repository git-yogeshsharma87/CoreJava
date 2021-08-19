package com.practice.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {

		//Order is not preserved
		Map<String, Double> mapOfItems = new HashMap<String, Double>();
		
		mapOfItems.put("Orange", 87.3);
		mapOfItems.put("Apple", 77.4);
		mapOfItems.put("Kiwi", 67.6);
		mapOfItems.put("Banana", 57.1);
		mapOfItems.put("Mango", 47.0);
		
		System.out.println(mapOfItems);
		System.out.println(mapOfItems.get("Kiwi"));
		
		System.out.println("----------------------------------------------------------------");
		
		// order is preserved
		Map<String,Integer> mapOfCities = new LinkedHashMap<>();
		mapOfCities.put("Alaska", 393833);
		mapOfCities.put("Mexico", 234324);
		mapOfCities.put("Virgina", 56564);
		mapOfCities.put("Kansas", 45673);
		mapOfCities.put("Mumbai", 985677);
		
		System.out.println(mapOfCities);
		
		System.out.println("------------------------------------------");
		
		// based on keys and in ascending by default
		TreeMap<Integer,String> mapOfEmployees = new TreeMap<>();
		
		mapOfEmployees.put(101, " Marry Smith");
		mapOfEmployees.put(102, " John Smith");
		mapOfEmployees.put(103, " Mike Smith");
		mapOfEmployees.put(104, " Marry Smith");
		mapOfEmployees.put(102, " Marry Smith");

		System.out.println(mapOfEmployees);
		System.out.println(mapOfEmployees.descendingMap());
		
	}
}
