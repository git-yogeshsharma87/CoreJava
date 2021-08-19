package com.practice.datastructures.stack.arraystack;


public class TestArrayStack {

	public static void main(String[] args) {

		Employee employee1 = new Employee(10001," MIke Smith", "Engineering", 3434523);
		Employee employee2 = new Employee(10002," Ava Smith", "Engineering", 35455);
		Employee employee3 = new Employee(10003," Mark Smith", "Engineering", 768678);
		Employee employee4 = new Employee(10004," William Smith", "Engineering", 98674);
		
		ArrayStack stack = new ArrayStack(2);
		
		System.out.println("Stack size : "+ stack.size());
		System.out.println("Stack capacity : "+ stack.capacity());
		System.out.println("Stack is empty ?  : "+ stack.isEmpty());
System.out.println("------------------------------");
		stack.push(employee1);
		stack.push(employee2);
		stack.push(employee3);
		stack.push(employee4);
		stack.push(employee2);
stack.pop();

		System.out.println("Stack size : "+ stack.size());
		System.out.println("Stack capacity : "+ stack.capacity());
		System.out.println("Stack is empty ?  : "+ stack.isEmpty());
		stack.printStack();
	
		System.out.println("Stack top " +stack.peek());
		stack.pop();

	}

}
