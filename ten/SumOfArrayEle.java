package com.java.practice.ten;

public class SumOfArrayEle {

	public static void main(String[] args) {
		int sum=0;
		int []a= {3,4,5,6,7,9,3,2,2,0};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum of given array element is: "+sum);
	}

}
