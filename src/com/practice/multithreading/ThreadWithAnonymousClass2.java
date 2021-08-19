package com.practice.multithreading;

public class ThreadWithAnonymousClass2 {

	public static void main(String[] args) {

		/*
		 * Runnable obj1 = ;
		 * 
		 * Runnable obj2 = ;
		 */
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0;i<10;i++) {
					System.out.println("Thread ABC is running .. ");
				}
			}
			
			
		});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0;i<10;i++) {
					System.out.println("Thread XYZ is running .. ");
				}
			}
			
			
		});
		
		thread2.start();
	}

}
