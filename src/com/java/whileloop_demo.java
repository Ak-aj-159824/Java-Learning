package com.java;

public class whileloop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Print numbers from 1 to 10 using while loop.
		int i = 1;

		System.out.println("Printed numbers from 1 to 10");
		while (i <= 10) {
			System.out.print(i + " ");
			i++;

		}

		// 2. Print all even numbers between 1 and 20
		int j = 1;
		System.out.println("\nPrint all even numbers between 1 and 20");

		while (j <= 20) {

			if (j % 2 == 0) {
				System.out.print(j + " ");

			}
			j++;
		}

	}
}
