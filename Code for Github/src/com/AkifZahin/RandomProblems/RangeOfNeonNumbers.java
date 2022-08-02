package com.AkifZahin.RandomProblems;
import java.util.Scanner;
public class RangeOfNeonNumbers {
//	Write down a function that will take an integer as parameter and will return true if the integer is a
//	neon number and return false otherwise. Using this function write down a program that will print all
//	neon numbers between two ranges num1 and num2 that will be input to your program. Assume that num1 <
//	num2.
	public static void main(String[] args) 
	{
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		//Taking user input
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();		
		
		System.out.println("Enter last number: ");
		int num2 = input.nextInt();
		
		input.close();
		
		//Function is used in a loop to iterate through range and only print out numbers where true is returned.
		System.out.print("Neon Numbers: ");
		for(int i=num1; i<=num2; i++)
		{
			if(NeonNumber(i) == true)
			{
				System.out.print(" " +i);
			}
		}
			
	}
	//Function returns boolean value 
	public static boolean NeonNumber(int n)
	{
		//Number is squared first and sum is set to 0
		int squaredNumber = n*n;
		int remainingNumber,sum=0;
		
		//Squared number is broken down to its digits and then added to sum
		while(squaredNumber>0)
		{
			remainingNumber = squaredNumber%10;
			sum+=remainingNumber;
			squaredNumber/=10;
		}
		//Returns true only when sum is equal to n
		if(sum==n)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
}
