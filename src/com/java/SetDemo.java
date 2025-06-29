package com.java;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "AJAYKUMAR";

		System.out.println(a.length());

		HashSet<Character> hs = new HashSet<Character>();

		char[] ch = a.toCharArray();

		for (char c : ch) {

			hs.add(c);
		}

		System.out.println(hs.size());
		System.out.println(hs.toString());

	}

}
