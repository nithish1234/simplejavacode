package com.string;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this is the sample for split method";
		// String s2[]=s1.split("\\s");

		for (String words : s1.split("\\s", 2)) {
			System.out.println(words);
		}
	}
}
