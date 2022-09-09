//Write a program that will read N postitve numbers untill 0 or a negetive number is inputed from
//keyboard. using a do-loop and will display their sum.


package com.AkifZahin.Lab_Exercises.Lab3;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args)
	{
		
		double n,sum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inputs: ");
		do
		{
			
			n = input.nextDouble();
			
			if(n<=0)
			{
				break;
			}
			else
			{
				sum+=n;
			}
			
		}
		while(n>0);

		System.out.printf("Sum: %.2f",sum);
	}

}
