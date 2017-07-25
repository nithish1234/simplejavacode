//package com.regex;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//public class Regex2 {
//
//	
//	public static void main(String[] args){    
//	        Scanner sc=new Scanner(System.in);  
//	        while (true) {    
//	            System.out.println("Enter regex pattern:");  
//	            Pattern pattern = Pattern.compile(sc.nextLine());    
//	            System.out.println("Enter text:");  
//	            Matcher matcher = pattern.matcher(sc.nextLine());    
//	            boolean found = false;  
//	            while (matcher.find()) {    
//	                System.out.println("I found the text "+matcher.group()+" starting at index "+    
//	                 matcher.start()+" and ending at index "+matcher.end());    
//	                found = true;    
//	            }    
//	            if(!found){    
//	                System.out.println("No match found.");    
//	            }    
//	        }    
//	    }
//}

package com.regex;

import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {

		String s = "HelLOW  World! \n 3 + 3.0 = 6.0 true" ;

		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(s);

		// print the next line
		System.out.println("nithish " );

		// print the next line again
		System.out.println("bharath" + scanner.nextLine());

		// close the scanner
		scanner.close();
	}
}