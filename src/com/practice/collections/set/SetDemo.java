package com.practice.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set is child interface in collection
		//Set do not store duplicate values 
		// Implementation class - HashSet, LinkedHashSet, TreeSet
		
		//Declaration
		// set1 when we donot want any insertion order to be preserved
		Set<String> set1 = new HashSet<String>(); 
		// set2 when we want to preserve the insertion order
		Set<String> set2 = new LinkedHashSet<String>();
		//set3 is we want to arrange data elements in ascending or descending order
		Set<String> set3 = new TreeSet<String>();

		Set<String> setOfUniqueCompanies = new HashSet<>();
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("SYM");
		setOfUniqueCompanies.add("RYM");
		setOfUniqueCompanies.add("DELL");

		System.out.println(setOfUniqueCompanies);
		
		//enhance for loop 
		for (String compName : setOfUniqueCompanies) {
			System.out.println(compName);
		}
		
		//Linked HasSet
		System.out.println("----------------------");
		Set<String> setOfUniqueBrands = new LinkedHashSet<>();
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Adidas");
		setOfUniqueBrands.add("Fila");
		setOfUniqueBrands.add("ASICS");
		setOfUniqueBrands.add("Nike");

		System.out.println(setOfUniqueBrands);
	
		//TreeSet
		System.out.println("----------------------");
		TreeSet<String> setOfUniqueName = new TreeSet<>();
		setOfUniqueName.add("John");
		setOfUniqueName.add("Mike");
		setOfUniqueName.add("William");
		setOfUniqueName.add("Bob");
		setOfUniqueName.add("Mark");

		System.out.println(setOfUniqueName);
		System.out.println(setOfUniqueName.descendingSet());

		//enhanced for loop 
	
	}
	
	

}
