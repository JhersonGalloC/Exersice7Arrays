package com.exersice7arrays.pp;
import java.util.Random;
public class Primos {

	public static void main(String[] args) {
		//Constant declaration
		final int ELEMENTS_ARRAY=14;
		//VARIABLE DECLARATION
		byte primeNumbers=0;
		boolean isPrime=true;
		//Array declaration
		byte[] vector = new byte[ELEMENTS_ARRAY];
		
		//Objet declaration
		Random randomNumbers= new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = (byte) randomNumbers.nextInt(14);
		}
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			for(int j=2;j<vector[i];j++) 
			{	
				isPrime=true;
				
				if(vector[i]%j==0)
				{
					isPrime=false;
					break;
				}
				if(isPrime)
				{
					primeNumbers++;
				}
			}
			System.out.println("Quantity of prime numbers is: "+primeNumbers);
		}
	}

}
