package com.java;

import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter your number:");
		int a = x.nextInt();
		x.nextLine();
				
		
		if(a==1) {
			
			System.out.println("Value printed is equal to 1");
		}else if(a>10) {
			
			System.out.println("Value printed grater than 10");
		}else if(a<10) {
			
			System.out.println("Value printed lesser than 10");
		}else if(a==10) {
			
			System.out.println("Value printed is equal to 10");
		}
		
		System.out.println("Enter your name: ");
		String b = x.nextLine();
		
		
		StringBuilder stringnew = new StringBuilder(b);
		 String reversed = stringnew.reverse().toString();
		 System.out.println(reversed);
		
		 
		 
	x.close();
	}
	


}
