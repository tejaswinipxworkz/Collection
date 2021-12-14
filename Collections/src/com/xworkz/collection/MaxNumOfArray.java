package com.xworkz.collection;

public class MaxNumOfArray {

	public static void main(String[] args) {
		int a[] = { 20, 56, 89, 90, 76 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum number from an array is " + max);
	}
}
