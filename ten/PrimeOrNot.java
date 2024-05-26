package com.java.practice.ten;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(n+" is Not a Prime number");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+ " is Not a Prime number");
                    return;
                }
            }
         
        	System.out.println(n+ " is a Prime number");
        }
         
	}
}

