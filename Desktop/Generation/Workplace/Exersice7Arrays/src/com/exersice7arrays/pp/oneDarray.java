package com.exersice7arrays.pp;

public class oneDarray {

	public static void main(String[] args)
	{	
		//contact
		
		final int ELEMENTS_ARRAY = 10;
		//Arrays Declaration
		// I want 10 elements because it is a pratice project
		int[] intArray = new int[10];
				char[] charArray = new char[10];
				boolean[] booleanArray = new boolean[10];
				double[] doubleArray = new double[10];
				String[] strArrays = new String[10];
				
				int[] intArray2 = {10, 20, 30, 40, 50, 60};
				char[] charArray2 = {'a','b','c','d'};
				boolean[] boolArray2 = {true,false,true,false, true};
				double[] dblArray2= {1.0,2.0,3.0,4.0,5.0,};
				String[] strArray2 = {"first","second", "third","fourth",};
				
				for(int i=0;i<charArray2.length;i++)
				{
					System.out.println(charArray2[i]);
				}
				for(int i=0;i<intArray2.length;i++)
				{
					System.out.println(intArray2[i]);
				}
				for(int i=0;i<boolArray2.length;i++) 
				{		
					System.out.println(boolArray2[i]);
				}
				for(int i=0;i<strArray2.length;i++)
				{
					System.out.println(strArray2[i]);
				}
	

	}

}
