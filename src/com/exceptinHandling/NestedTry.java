package com.exceptinHandling;

public class NestedTry {
public static void main(String[] args) {
	try {
		System.out.println("sample code");
		try {
			int sample=50/0;
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			
	}
	catch (Exception e) {
		// TODO: handle exception
	System.out.println(e);
	}
}
}
