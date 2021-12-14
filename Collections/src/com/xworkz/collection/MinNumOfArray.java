package com.xworkz.collection;

public class MinNumOfArray {
	public static void main(String[] args) {
		int a[] = { 20, 1, 56, 89, 90, 76 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum number from an array is " + min);
	}
}