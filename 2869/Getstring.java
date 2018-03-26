package com.string;

import java.util.Scanner;

public class Getstring {

	static String getinputStr() {
		
	       System.out.println("Enter a String");
	       Scanner sc=new Scanner(System.in);
	       String str=sc.nextLine();
	       return str;
		}
	
	static int getinputopt() {
		
	       System.out.println("Enter an operation");
	       System.out.println("1. Reverse the string");
	       System.out.println("2. Search  inside the string");
	       System.out.println("3. Search and replace inside the string");
	       
	       Scanner sc1=new Scanner(System.in);
	       int opt=sc1.nextInt();
	       return opt;
	}
	
	static String getsearchstr() {
		
	       System.out.println("Enter the search string");
	       
	       Scanner sc2=new Scanner(System.in);
	       String sstr =sc2.nextLine();
	       return sstr;
	}
	
	static String getreplstr() {
		
	       System.out.println("Enter the replace string");
	       
	       Scanner sc3=new Scanner(System.in);
	       String rstr =sc3.nextLine();
	       return rstr;
	}
}
