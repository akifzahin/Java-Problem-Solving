//Write a method sumDigit() that takes an integer and returns the sum of digits.


package com.AkifZahin.Lab_Exercises.Lab4;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n = ");
		int num = input.nextInt();
		
		System.out.println("Sum = "+ sumDigit(num));
	}
	
	public static int sumDigit(int n)
	{	
		int temp,sum = 0;
		while(n>0)
		{
			n = n%10;
			temp = n;
			sum+=temp;
			n/=10;
		}
		return sum;
	}
}
