package com.java.practice.ten;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter terms till fibonacci series you want to print");
         int n=sc.nextInt(); // n is number of terms
         System.out.println(a);
         System.out.println(b);
         for(int i=1;i<=n-2;i++) {
        	 c=a+b;
        	 System.out.println(c); 
        	 a=b;
        	 b=c;
         }
	}

}
