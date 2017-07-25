package com.exceptinHandling;

public class ExceptionHandling {
public static void main(String[] args) {
	try {
		int sample=50/0;
		System.out.println(sample);
	}
	catch (Exception e) {
		// TODO: handle exception
//		e.printStackTrace();
	System.out.println(e);
	}
	finally {
		System.out.println("executable code");
	}
}
}
