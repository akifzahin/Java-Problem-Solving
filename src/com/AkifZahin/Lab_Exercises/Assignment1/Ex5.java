package com.AkifZahin.Lab_Exercises.Assignment1;
import java.util.*;
import java.io.*;

//Given a file called numbers.txt contains a list of numbers separated by
//space. Write a method isPrime(int num) and returns a true if the number is
//prime and false if the number is not a prime number. Now create a Junit
//test for this method to perform the necessary tests. In the main method
//Create an array list from numbers.txt and calculate the sum of all prime
//numbers. Use isPrime(int num) method to determine whether the number
//is prime or not.

public class Ex5 {

	public static void main(String[] args) 
	{
		//File Path
		String filePath = "src/Ex5/numbers.txt";
		
		//Creating File Object
		File fileObj = new File(filePath);
		
		//Creating ArrayList
		ArrayList<Integer> List_1 = new ArrayList<Integer>();
		
		//Reading File
		try
		{
			Scanner fileReader = new Scanner(fileObj);
			while(fileReader.hasNext())
			{
				List_1.add(fileReader.nextInt());
				//fileReader.nextLine();
			}
			System.out.println("Numbers are: " +List_1);
			fileReader.close();
		}
		catch(FileNotFoundException E)
		{
			System.out.println("File not Found!");
			E.printStackTrace();
		}
		
		//Passing Function
		int sum=0;
		System.out.println("Prime Numbers: ");
		for(int i=0; i<List_1.size(); i++)
		{
			if(IsPrime(List_1.get(i)))
			{
				sum+=List_1.get(i);
				System.out.println(" " +List_1.get(i));
			}
		}
		
		System.out.println("Sum of Prime Numbers: " +sum);
	}
	
	//IsPrime Function
	public static boolean IsPrime(int num)
	{
		boolean isPrime=true;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	
	}




}
