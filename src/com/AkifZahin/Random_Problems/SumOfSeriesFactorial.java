package com.AkifZahin.Random_Problems;
import java.util.Scanner;
public class SumOfSeriesFactorial {

//	Write down a function what will take an integer n as parameter and will return the summation of the
//	following series:
//	1!/1 +2!/2 +3!/3 +4!/4 ... ... ... + n!/n		
	
	public static void main(String[] args)
	{
		
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter value of n: ");
		int n = input.nextInt();
		
		input.close();
		
		System.out.printf("Sum of series: %.0f", SumOfSeries(n));
		
	}
	
	public static double SumOfSeries(int num)
	{
		//Loop control variable and summation variable declared
		int i,j,fact=1;
		double sum=0;
		
		//For loop iterates through each term
		for(i=1;i<=num;i++)
		{
			fact*=i;
			sum+=(fact/(double)i);
		}
		return sum;
	}


}
