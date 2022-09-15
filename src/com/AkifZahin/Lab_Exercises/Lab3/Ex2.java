//Print summation of the following series: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n where integer n will be input to
//your program.


package com.AkifZahin.Lab_Exercises.Lab3;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) 
	{
		int i;
		double sum=0,fraction;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N =  ");
		int n = input.nextInt();
		input.close();
		
		for(i=1;i<=n;i++)
		{
			fraction=1.0/i;
			sum+=fraction;
		}
		
		System.out.printf("Summation = %.2f",sum);
		
	}


}
