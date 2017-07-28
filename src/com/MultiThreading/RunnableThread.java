package com.MultiThreading;

import java.util.Scanner;

public class RunnableThread implements Runnable {
	public void run() {
		try {
			
		System.out.println("enter the value");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		

			if (i > 10) {
				for (i = 0; i <= 10; i++) {
					System.out.println("the extended value" + i);
					Thread.sleep(1000);
				}

			}

		} 
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("beyond limit of if block ");
		}
	}

//	public static void main(String[] args) {
//		RunnableThread obj = new RunnableThread();
//		Thread t1 = new Thread(obj, "thread");
//		t1.start();
//	}

}
