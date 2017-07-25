package com.nextline;
import java.util.Scanner;
public class NextLine {
   public static void main(String[] args) {
	

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence:\t");
	        String sentence = scanner.next();
  	        System.out.print("Enter an index:\t");
	        int index = scanner.nextInt();

	        System.out.println("\nYour sentence:\t" + sentence);
	        System.out.println("Your index:\t" + index);
	    scanner.close();
	    }
	    
	}

