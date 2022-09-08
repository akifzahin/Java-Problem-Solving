package com.AkifZahin.RandomProblems;
import java.util.Scanner;
public class PowerOfNumbers 
{
//	Write down a function power(x,y) that will take two integers x and y as parameter and will return x^y.
//	Note that y can be negative. In your main function take two integers as input and use this function to
//	determine and print the power. 
	
	public static void main(String[] args) 
	{
		//Initializing Scanner 
		Scanner input = new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter base: ");
		int base = input.nextInt();
		
		System.out.println("Enter power: ");
		int power = input.nextInt();
		
		input.close();
		
		//Printed upto 3 decimal places
		System.out.printf("%d ^ %d is: %.3f",base,power,PowerFunction(base,power));

	}
	
	//Power Function Built
	public static double PowerFunction(int base, int power)
	{
		int i;
		double sum=1;
		//The for loop cycles through each iteration and multiplies the base with sum
		
		//For positive powers (when power is greater than 0)
		if(power>=0) 
		{
			for(i=1; i<=power; i++)
			{
				sum*=base;
			}
			
		}
		
		//For negative powers, loop cycles until i=-power and multiplies sum with 1/base
		else 
		{
			for(i=1; i<=-power; i++)
			{
				sum*=(1/(double)base);
				
			}
			
		}
		return sum;
	}
}
