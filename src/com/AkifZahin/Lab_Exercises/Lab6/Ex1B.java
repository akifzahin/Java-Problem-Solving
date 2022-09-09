//Write down a function what will take an integer n as parameter and will return the summation of the
//following series:
//1!/1 +2!/2 +3!/3 +4!/4 ... ... ... + n!/n
package com.AkifZahin.Lab_Exercises.Lab6;
import java.util.Scanner;
public class Ex1B {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n = input.nextInt();
		input.close();
		
		System.out.println("Result is = " +SumOfSeries(n) );
		
	}

	public static double SumOfSeries(int x)
	{
		int i,j,factorial=1;
		double term=0,sum=0;
		for(i=1; i<=x; i++)
		{
			for(j=1; j<=i; j++)
			{
				factorial*=j;
				term = factorial/j;
			}
			sum+=term;
		}
		return factorial;
	}

}

