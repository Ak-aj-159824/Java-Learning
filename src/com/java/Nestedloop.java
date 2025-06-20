package com.java;

public class Nestedloop {

public static void main(DemoPractice[] args) {
	
//	int a[][] = new int[2][2];
//	
//	a[0][0]= 2;
//	a[0][1]= 3;
//	a[1][0] = 4;
//	a[1][1] = 5;
	
	int a[][] = {{1,2,11},{4,5,6},{7,1,0}};
	int max = a[0][0];
	
	for(int i=0; i<a[0].length; i++)
		
	{
		for(int j=0; j<a[1].length; j++) 
		{
			if(a[i][j]>max)
{
	max=a[i][j];
}
			
		}
	}
	
	
	System.out.println(max);	
	
}

	}