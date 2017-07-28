package com.stringsample;

import java.util.Scanner;

public class StringSample {
	public static void main(String[] args) {
String last=new String();
		System.out.println("enter the first name");
		Scanner input = new Scanner(System.in);
		String name1 = input.nextLine();
		System.out.println("enter the secon name");
		String name2 = input.nextLine();
		String nameTotal=name1+name2;
		int lengthname=nameTotal.length();
		char[] ch1 = new char[name1.length()];
		char[] ch2 = new char[name2.length()];
		try {
			name1.getChars(0, name1.length(), ch1, 0);
			name2.getChars(0, name2.length(), ch2, 0);
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
//						char[] ch3 = new char[];
//						ch3
						last=last+ch1[i];
						System.out.println(last.length());
//						int totalnames=nameTotal.length()-last.length();
//						System.out.println("total name" +totalnames);
						
						

						
					}
				}
			}
			int totalnames=nameTotal.length()-last.length();
			System.out.println("total name" +totalnames);
		} catch (Exception e) {
			System.out.println("something went wrong");
		}
		// for( int i=0;i<=name1.length();i++) {
		// for(int j=0;j<name2.length();i++) {
		// System.out.println(+i +j);
		// }
		// }
	}
}
