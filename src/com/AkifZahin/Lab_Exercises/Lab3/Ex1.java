//Write down a program using while loop that will print all factors of a number n and the total number
//of factors of it. N will be input to your program. For example if N = 6, it has four factors namely 1, 2,
//3, 6 and it has total 4 factors.

package com.AkifZahin.Lab_Exercises.Lab3;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args)
	{
		int i=1, counter = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N = ");
		input.close();
		
		int n = input.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
				counter++;
			}
			i++;
		}
		System.out.printf("%d has total %d factors",n,counter);

}

}
