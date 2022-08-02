package com.AkifZahin.RandomProblems;
import java.util.Scanner;
public class RangeOfArmstrongNumbers 
{
//	Write down a function that will take an integer as parameter and will return 1 if the integer is an
//	Armstrong number of three digits and return 0 otherwise. Using this function write down a program
//	that will print all Armstorng numbers between two ranges n1 and n2 that will be input to your
//	program. 
	
	public static void main(String[] args) 
	{
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Taking input first and last numbers of range
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter last number: ");
		int lastNumber = input.nextInt();
		
		//Scanner is closed
		input.close();
		
		//Loop is started to cycle through 
		System.out.print("Armstrong Numbers are:");
		for(int i=firstNumber; i<=lastNumber; i++)
		{
			//i is printed only if 1 is returned
			if(ArmstrongNumber(i)==1)
			{
				System.out.print(" " +i);
			}
		}
		

	}
	
	//Armstrong Number function 
	public static int ArmstrongNumber(int number)
	{
		int inputNumber = number;
		int remainingNumber=0,digits=0,sum=0;
		
		//Number of digits is counted
		while(inputNumber>0)
		{
			inputNumber/=10;
			digits++;
		}
		
		inputNumber = number;
		
		//Number is seperated into its digits, cubed and then added
		while(inputNumber>0)
		{
			remainingNumber = inputNumber%10;
			sum+=Math.pow(remainingNumber,digits);
			inputNumber/=10;
		}
		
		//Returns 1 only if sum and number match
		if(sum==number)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	


}
