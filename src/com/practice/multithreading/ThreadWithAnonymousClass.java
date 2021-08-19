package com.practice.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {

		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0;i<5;i++) {
					System.out.println("Thread ABC is running .. ");
				}
			}
			
			
		};
		
		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0;i<10;i++) {
					System.out.println("Thread XYZ is running .. ");
				}
			}
			
			
		};
		
		Thread thread1 = new Thread(obj1);
		thread1.start();
		Thread thread2 = new Thread(obj2);
		
		thread2.start();
	}

}
