package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List arraylist = new ArrayList();
		System.out.println("Before adding elements, condition is : " + arraylist.isEmpty());
		arraylist.add("xworkz");
		arraylist.add(1);
		arraylist.add(true);
		arraylist.add(27.34);
		arraylist.add('c');
		System.out.println("After adding elements, condition is  : " + arraylist.isEmpty());

		int size = arraylist.size();
		System.out.println("Size of an array before removing is : " + size);

		int indexOf = arraylist.indexOf('c');
		System.out.println("Index of 'C' is : " + indexOf);

		boolean contains = arraylist.contains(1);
		System.out.println("Given value presence condition is : " + contains);

		Object object = arraylist.get(3);
		System.out.println("The object present at index 3 is : " + object);

		arraylist.remove(2);
		int removingByIndex = arraylist.size();
		System.out.println("Size of an array after removing by index value is : " + removingByIndex);

		arraylist.remove(true);
		int removingByObject = arraylist.size();
		System.out.println("Size of an array after removing by object is : " + removingByObject);

		arraylist.removeAll(arraylist);
		int removeAll = arraylist.size();
		System.out.println("After removing all elements size of an array is : " + removeAll);
	}
}
