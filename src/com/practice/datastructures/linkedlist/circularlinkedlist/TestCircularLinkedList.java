package com.practice.datastructures.linkedlist.circularlinkedlist;


public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);
		
		//create circular linked list instance 
		CircularLinkedList clList = new CircularLinkedList();
		
		System.out.println("List is empty : " + clList.isEmpty());
		System.out.println("List size : "+clList.getSize());
		System.out.println("-----------------------");
clList.add(employee1);
clList.add(employee2);		
clList.add(employee3);		
clList.add(employee4);		

		System.out.println("List is empty : " + clList.isEmpty());
		System.out.println("List size : "+clList.getSize());
		
	//	Node removedNode = clList.remove();
		//System.out.println("Removed node : "+removedNode);
		clList.printList();
	}

}
