//Write a method isPalindrome(String input) that determines if a String is a palindrome or not and in
//the main class takes a string as user input. A palindrome is when a String remains the same after
//reversing. The method should return the Boolean type.


package com.AkifZahin.Lab_Exercises.Lab4;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String userString = input.nextLine();
		userString = userString.toLowerCase();
		input.close();
		
		isPalindrome(userString);
	}
	
	public static void isPalindrome(String sentence)
	{	
		int flag=0;
		for(int i=0;i<=sentence.length();i++)
		{
			if(sentence.charAt(i) != sentence.length())
			{
				flag=1;
			}
		}
	}
}
