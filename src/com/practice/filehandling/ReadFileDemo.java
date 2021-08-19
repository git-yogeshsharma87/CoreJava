package com.practice.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		readFile("test.txt");
		
	}
	
	private static void readFile(String filename) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			
			int count = 0;
			while((count=fileInputStream.read()) != -1) {
			System.out.print((char) count);
		//	int i = fileInputStream.read();			
			//System.out.println((char) i);
			}
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found exception ! ");
}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Read exception ! ");
}
		
	}

}
