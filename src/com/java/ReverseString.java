package com.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner st = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		 String str = st.nextLine();
		
		 System.out.println("Your string in Upper case: " + str.toUpperCase());
		
		 StringBuilder str1 = new StringBuilder(str);
		String rev = str1.reverse().toString();
		System.out.println("Your reversed string: " +rev);
		
	}

}
