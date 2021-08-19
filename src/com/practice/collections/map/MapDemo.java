package com.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// donot preserve order 
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		phoneBook.put("John", 8985985859L);
		phoneBook.put("Mike", 898598581L);
		phoneBook.put("Ava", 898598582L);
		phoneBook.put("Marry", 89859853L);
		phoneBook.put("Emma", 898598584L);
		phoneBook.put("Xyz", 898598586L);
		
		System.out.println(phoneBook);
		System.out.println("Eva's number : "+ phoneBook.get("Ava"));
		
		// iterate over map
		
		for (Map.Entry<String, Long> entry :phoneBook.entrySet()) {
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
			System.out.println("-----------------");
		}
				
	}

}
