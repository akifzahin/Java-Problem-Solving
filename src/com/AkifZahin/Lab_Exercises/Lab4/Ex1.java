//Write a method countVowels(String sentence) that takes a String as a parameter and returns the
//number of vowels.

package com.AkifZahin.Lab_Exercises.Lab4;
import java.util.Scanner;
public class Ex1 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String userString = input.nextLine();
		userString = userString.toLowerCase();
		input.close();
		
		
		System.out.print("Number of vowels: " + countVowels(userString));

	}
	
	public static int countVowels(String sentence)
	{	
		int i,count=0;
		for(i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}

}