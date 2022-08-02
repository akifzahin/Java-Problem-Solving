package com.AkifZahin.RandomProblems;
import java.util.Scanner;
public class RangeOfPerfectNumbers 
{
//	Write down a function that will take an integer as parameter and will return 1 if the integer is a
//	perfect number and return 0 otherwise. Using this function write down a program that will print all
//	perfect numbers between two ranges n1 and n2 that will be input to your program. Assume that n1 <
//	n2. 
	public static void main(String[] args) 
	{
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter last number: ");
		int n2 = input.nextInt();
		
		input.close();
		//Function is used in a loop to iterate through range and only print out numbers where 1 is returned.
		System.out.print("Perfect Numbers: ");
		for(int i=n1; i<=n2; i++)
		{
			if(PerfectNumber(i) == 1)
			{
				System.out.print(" " +i);
			}
		}
	}
	public static int PerfectNumber(int n)
	{
		int sum=0;
		
		//For loop iterates through each instance and adds the factors
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		//Returns 1 only when sum is equal to original number
		if(sum==n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
		
}

