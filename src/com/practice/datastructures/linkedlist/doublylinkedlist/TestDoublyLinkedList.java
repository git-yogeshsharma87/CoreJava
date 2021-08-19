package com.practice.datastructures.linkedlist.doublylinkedlist;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);
		
		//create singly linked list instance 
		DoublyLinkedList dllList = new DoublyLinkedList();
		
		System.out.println("List is empty : " + dllList.isEmpty());
		System.out.println("List size : "+ dllList.getSize());
		
		System.out.println("------------------------------------");
		dllList.addToFront(employee1);
		dllList.addToFront(employee2);
		dllList.addToFront(employee3);
		dllList.addToEnd(employee4);

		
		dllList.removeFromFront();
		dllList.removeFromEnd();

		System.out.println("List is empty : " + dllList.isEmpty());
		System.out.println("List size : "+ dllList.getSize());
		System.out.println("------------------------------------");

		dllList.printList();
		

	}

}
