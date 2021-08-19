package com.practice.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		try {
		//1. read a file 
		
		FileInputStream file = new FileInputStream("file-db.txt");
		//create a input stream object
		ObjectInputStream in = new ObjectInputStream(file);
		
		//deserialize to object 
		
		Employee employee = (Employee) in.readObject();
		
		System.out.println(" Dezerialization is completed");
		System.out.println(" Emp id : "+employee.getId());
		System.out.println(" Emp id : "+employee.getName());
		System.out.println(" Emp id : "+employee.getDept());
		System.out.println(" Emp id : "+employee.getSalary());
		
System.out.println(" Serial id is : "+ employee.getSerialversionuid());
		}
		
		catch  ( Exception e) {
			e.printStackTrace();
		}
		
	}

}
