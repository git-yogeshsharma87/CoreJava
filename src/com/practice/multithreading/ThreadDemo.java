package com.practice.multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {

			ThreadDemo mainThread = new ThreadDemo();
			
			mainThread.start();
		  
		
		

	}
	@Override
    public void run() {
       // thread processing logic
	  System.out.println(" Main Thread is running");
    }


}
