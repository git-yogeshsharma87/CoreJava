package com.practice.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	static String path = "/phase1-java-fundamentals-07-24-2021/";
	public static void main(String[] args) {

		deleteFile("data.txt"); 
	}

	
	private static void deleteFile(String filename) {
		
		//delete file logic
		try {
			// filename below takes path automatically from local
			Files.delete(Paths.get(path+filename));
			System.out.println("File is deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
System.out.println("File not found");		}
	}
}
