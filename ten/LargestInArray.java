package com.java.practice.ten;

public class LargestInArray {

	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,9,3,2,2,0};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
       System.out.println("largest number in given array elements is: "+max);
	}

}
