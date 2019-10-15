package com.arreglos2.app;

import java.util.Scanner;

public class factorial {
	public static void main(String[]args) 
	{
		int cont1=0;
		int cont2=1;
		long fibonacci=0;
		int bound=0;
		
		Scanner input = new Scanner(System.in);
		do
		{
			
		
		
		System.out.println("Cuantos fibonaccis deseas calcular?: ");
		bound = input.nextInt();
		if(bound<=0)
		{
			System.out.println("Debes de introducir un numero arriba de cero stupid");
		}
		}while(bound<=0);
		for(int i=0; i<bound;i++)
		{
			System.out.print(fibonacci+"");
			fibonacci = cont1+cont2;
			cont1=cont2;
			cont2=(int)fibonacci;
			}
		
		}

}