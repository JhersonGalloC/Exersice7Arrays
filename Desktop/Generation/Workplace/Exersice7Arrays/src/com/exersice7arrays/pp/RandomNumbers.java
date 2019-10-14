package com.exersice7arrays.pp;

import java.util.Random;
public class RandomNumbers {
	public static void main(String[]args)
	{
		//Constant declaation
		final int ELEMENTS_ARRAY = 100;
		//Variables declaration
		double generatedNumber=0;
		int generatedNumberInt=0;
		byte generatedNumberByte=0;
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		byte negativeValues=0;
		
		//Arrays declaration
		int[] miArray1 = new int[ELEMENTS_ARRAY];
		
		//Array paseudo random numbers
		//Way 1 BY MEANS OF RANDOM CLASS
		Random randomNumbers = new Random(System.nanoTime());
		
		
	for(int i=0; i<ELEMENTS_ARRAY;i++)
	{
		generatedNumber = randomNumbers.nextDouble();
		System.out.println(generatedNumber);
	}		
	for(int i=0; i<ELEMENTS_ARRAY;i++)
	{
		generatedNumberInt = randomNumbers.nextInt(51)+50;
		System.out.println(generatedNumberInt);
	}
	//WAY 2 BY means of math  class
	for(int i=0;i<ELEMENTS_ARRAY;i++)
	{
	generatedNumber = (int) (Math.random()*50)+50;
	generatedNumberInt=(int) generatedNumber;
	System.out.println(generatedNumberInt);
		
		//Pass 1 intialize
	}
	for(int i=0;i<miArray1.length;i++)
	{
		generatedNumberInt = randomNumbers.nextInt(101);
		//System.out.printl(generatedNumberInt);
		miArray1[i] = generatedNumberByte;
	}
	//Pass 2 process
	for(int i=0;i<ELEMENTS_ARRAY;i++)
	{
		if(miArray1[i]==0)
		{
			zeroValues++;
			
		}
		else if(miArray1[i]%2==0)
		{
			evenValues++;
			
		}
		else if(miArray1[i]>0)
		{
			positiveValues+=1;
			
		}
		else if(miArray1[i]%2==0)
		{
			oddValues+=1;
		
		}
		else if(miArray1[i]>0)
		{
			positiveValues+=1;
		}
		else if(miArray1[i]<0)
		{
			negativeValues+=1;
		}
	}
	//paso visualization
	System.out.println("Zeros quantity: "+zeroValues);
	System.out.println("Odd Values: "+oddValues);
	System.out.println("Even Values: "+evenValues);
	System.out.println("Positive Values: "+positiveValues);

	
	}
}
