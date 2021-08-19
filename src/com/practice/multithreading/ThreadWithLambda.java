package com.practice.multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {

		
		Thread thread1 = new Thread( () -> {
				// TODO Auto-generated method stub
				for (int i=0;i<10;i++) {
					System.out.println("Hi  .. "+i);
				}
			
			
			
		});
		Thread thread2 = new Thread( () -> {
			// TODO Auto-generated method stub
			for (int i=0;i<10;i++) {
				System.out.println("Hello  .. "+ i);
			}
		
		
		
	});
		thread1.start();
		thread2.start();
	}

}
