package com.practice.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		//Queue is a data structure which works in first in first out order
		Queue<String> peopleQueue = new ArrayDeque<>();
		
		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("John");
		peopleQueue.add("Jeet");
		
		
		//peek element 
		System.out.println("Initial queue : "+ peopleQueue);

		System.out.println("Head : "+ peopleQueue.peek());
		System.out.println("Head : "+ peopleQueue.element());

		//print and remove element from queue
		
	System.out.println("Remow Head : "+peopleQueue.poll());
	System.out.println("Head : "+ peopleQueue.peek());
	System.out.println("Updated queue : "+ peopleQueue);

	
	//iterate over queue 
	for(String person : peopleQueue ) {
		
		System.out.println(" Name : "+ person);
	}
	
	
	//Priority Queue : doesn't maintain FIFO order
	
	Queue<String> bankQueue = new PriorityQueue<>();

	bankQueue.add("John");
	bankQueue.add("Smith");
	bankQueue.add("Parul");
	bankQueue.add("Jeet");
	bankQueue.add("Mike");
	
	
	//iterate over priority queue and sequence will not be FIFO 
	for (String person : bankQueue) {
		System.out.println("Data : "+ person);
		
	}
	
	System.out.println("--------------------------");
	Deque<Integer> dequeue = new ArrayDeque<>();
	dequeue.add(100);
	dequeue.add(200);
	dequeue.add(300);
	dequeue.add(400);
	dequeue.addFirst(500);
	dequeue.addFirst(800);
	dequeue.addLast(1000);

	for(Integer elem : dequeue) {
		
		System.out.println("Element : "+ elem);
	}
	}

}
