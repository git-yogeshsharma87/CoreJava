package com.practice.datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);

		
		LinkedList<Employee> emLinkedList = new LinkedList<>();
		emLinkedList.add(employee1);
		emLinkedList.add(employee2);
		
		emLinkedList.addFirst(employee3);
		emLinkedList.addLast(employee4);
		
		System.out.println(emLinkedList);
	}
	
	

}
