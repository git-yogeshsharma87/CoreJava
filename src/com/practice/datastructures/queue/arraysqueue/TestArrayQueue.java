package com.practice.datastructures.queue.arraysqueue;



public class TestArrayQueue {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);
		
		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("Stack size : "+ queue.size());
		System.out.println("Stack capacity : "+ queue.capacity());
System.out.println("------------------------------");
queue.add(employee1);
queue.add(employee2);
queue.add(employee3);
queue.add(employee4);
		

System.out.println("Stack size : "+ queue.size());
System.out.println("Stack capacity : "+ queue.capacity());
System.out.println("------------------------------");

System.out.println("Top element is "+queue.peek());

queue.remove();
queue.printStack();




	}

}
