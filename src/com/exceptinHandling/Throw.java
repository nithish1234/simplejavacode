package com.exceptinHandling;

import java.rmi.MarshalException;

public 	class Throw {
		   static void  employeeAge(int age) throws MarshalException{
		      if(age < 0)
		         throw new MarshalException("Age can't be less than zero");
		      else
		         System.out.println("Input is valid!!");
		   }
		   public static void main(String[] args) {
		       try {
		            MarshalException(-2);
		       }
		       catch (ArithmeticException e) {
		            e.printStackTrace();
		       }
		   }
		private static void MarshalException(int i) {
			// TODO Auto-generated method stub
			System.err.println("sample");
		}
		}


