package com.practice.datastructures.linkedlist.singlylinkedlist;

import com.practice.datastructures.linkedlist.singlylinkedlist.Employee;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);
		
		//create singly linked list instance 
		SinglyLinkedList slList = new SinglyLinkedList();
		
		System.out.println("List is empty : " + slList.isEmpty());
		System.out.println("List size : "+slList.getSize());
		
		slList.add(null);
slList.add(employee1);
slList.add(employee2);		
slList.add(employee3);		
slList.add(employee4);		

		System.out.println("List is empty : " + slList.isEmpty());
		System.out.println("List size : "+slList.getSize());
		
		Node removedNode = slList.remove();
		System.out.println("Removed node : "+removedNode);
		slList.printList();
	}

}
