package com.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		{    
		    ArrayList<DemoPractice> a = new ArrayList<DemoPractice>();
		    a.add("apple");
		    a.add("banana");
		    a.add("cherry");
		    a.add("mango");
		    a.add("apple");
		    
		    System.out.println(a);
		    
		   a.remove(0);
		   System.out.println(a);
		   
		   System.out.println(a.contains("orange") +" " +"Orange is not found in Array list");
		   
		   
		   System.out.println(a.size());
		   
		   System.out.println("Elements (index, value):");
	        for (int i = 0; i < a.size(); i++) {
	            System.out.println("  - Index: " + i + ", Value: " + a.get(i));
		   
		}
		}
	}}

