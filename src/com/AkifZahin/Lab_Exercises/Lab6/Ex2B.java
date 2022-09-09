//Write down a function that will take an integer as parameter and will return 1 if the integer is a
//perfect number and return 0 otherwise. Using this function write down a program that will print all
//perfect numbers between two ranges n1 and n2 that will be input to your program. Assume that n1 <
//n2

package com.AkifZahin.Lab_Exercises.Lab6;
import java.util.Scanner;
public class Ex2B {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int i,j;
		
		System.out.println("Enter n1: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter n2: ");
		int n2 = input.nextInt();
		
		input.close();
		
		System.out.println("Perfect Numbers: ");
		for(i=n1; i<=n2; i++)
		{
			if(PerfectNumber(i) == 1)
			{
				System.out.println(i);
			}
			
		}
		
	}
	
	public static int PerfectNumber(int x)
	{
		int i,sum=0;
		for(i=1; i<=x/2; i++)
		{
			if(x%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==x)
		{
			//System.out.println("Yes.");
			return 1;
		}
		else
		{
			//System.out.println("No.");
			return 0;
		}
	}
	
	
	
}
