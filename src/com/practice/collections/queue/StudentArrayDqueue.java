package com.practice.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentArrayDqueue {

	public static void main(String[] args) {

		Student student1 = new Student(1001," Mike William", 01, "XYZ College");
		Student student2 = new Student(1002," John Smith", 02, "XYZ College");
		Student student3 = new Student(1003," Amy Smith", 03, "XYZ College");
		Student student4 = new Student(1004," Ava Joes", 04, "XYZ College");
		
		
		Queue<Student> studentQueue = new ArrayDeque<Student>();
		
		studentQueue.add(student1);
		studentQueue.add(student2);
		studentQueue.add(student3);
		studentQueue.add(student4);
		
		System.out.println(studentQueue);
		
		for(Student s : studentQueue) {
			
			System.out.println("Student : "+s);
			
		}
	}

}
