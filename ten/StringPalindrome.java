package com.java.practice.ten;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		int len=str.length();
		for(int i=len-1; i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		/*
		for(int i=0;i<len;i++) {
        if(rev.charAt(i)==str.charAt(i)) {
        	rev=str;
        	//System.out.println("given is a palindrome");
        }
        	//System.out.println("given string is not palindrome");
		}
		if(rev=str) {
			
		}
		*/
		 if (str.equals(rev.toString())) {
	            System.out.println("Given string is a palindrome");
	        } else {
	            System.out.println("Given string is not a palindrome");
	        }
	}
}
