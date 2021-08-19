package com.practice.multithreading;

public class OrganizationThread extends Thread{

	//main thread
	public static void main(String[] args) {
		
		//create a new thread
		
		John thread1 = new John();
		thread1.start();
		
		//create a 2nd  thread Sam
		
		Sam thread2 = new Sam();
		thread2.start();
		
		//create a 3rd thread Yogesh
				
		Yogesh thread3 = new Yogesh();
		thread3.start();
				
	
		
		
		
	}

}

class John extends Thread {
	@Override
    public void run() {
       // thread processing logic
	  System.out.println("John thread is running ..");
    }
	
}
class Sam extends Thread {
	
	@Override
    public void run() {
       // thread processing logic
	  System.out.println("Sam thread is running ..");
    }
	
	
}
class Yogesh extends Thread {
	
	@Override
    public void run() {
       // thread processing logic
	  System.out.println("Yogesh thread is running ..");
    }
	
	
}