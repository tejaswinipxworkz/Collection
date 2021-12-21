package com.xworkz.collection.CompareTo_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestHuman {
	public static void main(String[] args) {

		Human[] obj = { new Human("Komal", 10), new Human("Monika", 16), new Human("Neha", 12),
				new Human("Karishma", 17), };
		Arrays.sort(obj);
		for (Human human : obj) {
			System.out.println(human.getName());
			System.out.println(human.getAge());
		}
	}
}
