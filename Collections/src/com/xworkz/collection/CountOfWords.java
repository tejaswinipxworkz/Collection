package com.xworkz.collection;

public class CountOfWords {

	public static void main(String[] args) {

		String str = "Beauty is not in the face, beauty is a light in the heart";
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a String is " +count);
	}
}
