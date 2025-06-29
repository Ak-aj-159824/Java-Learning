package com.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public void ArrayListFunctions() {

//		Scanner string = new Scanner(System.in);
//		ArrayList<String> a = new ArrayList<String>();
//
//		System.out.println("Enter your array list: ");
//
//		String str = string.nextLine();
//		string.nextLine();
//		a.add(str);

		ArrayList<String> a = new ArrayList<String>(); // Declare the ArrayList class
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple");

		System.out.println(a);

		a.remove(0);
		System.out.println(a);

		System.out.println(a.contains("orange") + " " + "Orange is not found in Array list");

		System.out.println(a.size());

		System.out.println("Elements (index, value):");
		for (int i = 0; i < a.size(); i++) {
			System.out.println("  - Index: " + i + ", Value: " + a.get(i));

		}
		System.out.println(a.getFirst());

	}

	public static void main(String[] args) {

		{
			ArrayListDemo a = new ArrayListDemo();
			a.ArrayListFunctions();
		}
	}
}
