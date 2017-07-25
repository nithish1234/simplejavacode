package com.string;

public class Charat {

	public static void main(String[] args) {
              String s1="hilll was at the top of the mountain";
            		 char ch[]= new char[10];
            		 s1.getChars(2, 12, ch,0);
              System.out.println(ch);
	}

} 
