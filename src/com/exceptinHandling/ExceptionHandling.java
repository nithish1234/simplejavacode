package com.exceptinHandling;

import java.util.Scanner;

public class ExceptionHandling {


	void sample() {
		try {
		
			Scanner input = new Scanner(System.in);
			System.out.println("enter the first number");
			int a = input.nextInt();
			System.out.println("enter the next number");
			int b = input.nextInt();
			int c = a / b;
			System.out.println("the answer is" + c);
			// int sample[]=new int[5];
			// sample[10]=34;

		}

		catch (Exception e) {
			// TODO: handle exception
			System.err.println("cant do");
		
		} 
//		catch (Exception e) {
//			// TODO: handle exception
//			// e.printStackTrace();
//			System.err.println("not able to divide");

	//	} 
	finally {
			this.sample();
		}

	}
	static class terminal extends ExceptionHandling{

	public static void main(String[] args) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.sample();
		

	}
}
}
