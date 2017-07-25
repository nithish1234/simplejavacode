package com.exceptinHandling;

public class ExceptionHandlingtest2 {
public static void main(String[] args) {
	try {
		int a[]=new int[5];
		 a[10]=30;
	}	
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
