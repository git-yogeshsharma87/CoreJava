package com.practice.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//List -> ordered collection of data elements with duplicates allowed
		//List (interface) -> imp classes -> ArrayList, Linkedlist, Vector , Stack
		
		//declaration
	//array List is best when doing read operations since not thread safe	
		List<String> list1 = new ArrayList<String>(); // allows to store data backed by dynamic array and not thread safe.
	// LinkedList is not thread safe -> delete, insert and relace operations
		List<String> list2 = new LinkedList<String>(); //backed by doubly linked list data structure
			
		List<String> list3 = new Vector<String>();//thread safe collection
		List<String> list4 = new Stack<String>();//thread safe collection
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Bob");
		namesList.add("Bob"); //duplicate
		namesList.add("Mark");
		namesList.add("John");
		namesList.add("Bob");
		
		System.out.println(namesList);
		System.out.println("the element at index 2 "+ namesList.get(2));
		
		namesList.add(1,"Mark");
		System.out.println("New value at 1 "+namesList.get(1));
		
		//iteration on list 
		
	Iterator<String> itr = namesList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	System.out.println("------------------------------");
	
//enhanced for loop 
	
	for(String name: namesList) {
		
		System.out.println(name);
		
	}
	
//counter for loop 
	

	for (int index = 0;index <namesList.size();index++) {
		
		System.out.println("The index "+ index + " and name is : "+namesList.get(index));
				
	}
	
	}

}
