package com.java;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;

		Scanner s = new Scanner(System.in);
		System.out.println("Give your string to remove duplucates ");
		String str2 = s.nextLine();
		String str = str2.toLowerCase();
		
		
		Set<Character> ch = new LinkedHashSet<>();
		
		for( i=0; i<str.length(); i++)
		
		{
			
		 ch.add(str.charAt(i));
		
		}
		
		for(Character c : ch) {
			
			System.out.print(c);
		}
		s.close();
	}

}
