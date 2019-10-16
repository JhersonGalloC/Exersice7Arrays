package com.exersice101subprogramas.app;

import java.util.Scanner;

public class SubProgramas {

	public static void main(String[] args) 
	{
		//variables declaration
		int num1=0;
		int num2=0;
		int result=0;
		
		//object declaration
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(ShowTunnedMessage("Jherson"));
		showMessage();
		num1=entrada.nextInt();
		showMessage();
		num2=entrada.nextInt();
		
		result= AddNumeros(num1, num2);
		
		System.out.println("Result is:"+result);
				

	}
	private static void ShowTunnedMessage() {
		// TODO Auto-generated method stub
		
	}
	//Method to ask number
	public static void showMessage()
	{
		System.out.println("Input a number:");
	}
	//Method to show a tuned message
	public static String ShowTunnedMessage(String message)
	{
		return "Hola"+message;
	}
	//Method to add number
	public static int AddNumeros(int num1, int num2)
	{
		return num1+num2;
	}
	
}
