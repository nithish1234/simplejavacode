package com.exceptinHandling;

public class ThrowKeyword {
public void  age( int agevar) {
	if(agevar<18) {
		throw new ArithmeticException("not eligible");
	}
	else
	{
	System.out.println("u r eligible");
	}
}
public static void main(String[] args) {
	ThrowKeyword obj =new ThrowKeyword();
	obj.age(11);
}
}

