package com.practice.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		// 1. create object
		Employee employee = new Employee(10001,"Eva Smith", "Engineering",99987.87f);
		
		//2. Create a byte stream 
		
		try {
			//create file output stream

			FileOutputStream file  = new FileOutputStream("file-db.txt");
			
			// create object steam 
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// serialize an object
			
			out.writeObject(employee);
			
			System.out.println("Serialization is completed");
			
			out.close();
			file.close();
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}

}
