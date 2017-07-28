package com.MultiThreading;

public class multiThread extends Thread {
	public void run() {
		try {
			int count = 0;
			while (count <= 10) {
				count ++;
				System.out.println("the number is " +count );

				Thread.sleep(1000);
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		multiThread obj = new multiThread();
		obj.start();

	}
}
