package com.intefaceloop;

/*
 * The enhanced for loop in java also known as for each loop.
 * it simplifies iterating over arrays and collection by automatically.
 * handling iteration process without needing explicit index control.
 * offing  cleaner syntax and reducing potential errors. 
 * 
 */


public class School 
{

	public static void main(String[] args) 
	{
	
		int[] num = {12,45,67,89};
		
		for(int i = 0;i<4;i++)
		{
			System.out.println(num[i]);
		}
		
		for(int var : num)
		{
			System.out.println(var);
		}
	}

}
