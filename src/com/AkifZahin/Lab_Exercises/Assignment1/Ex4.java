package com.AkifZahin.Lab_Exercises.Assignment1;
import java.io.*;
import java.util.*;
public class Ex4

//Given a file called numbers.txt, write a Java program to read the file and
//calculate the sum of the unique numbers and show them in the console.

{

	public static void main(String[] args) 
	{
		 //Making File Name
		Scanner input = new Scanner(System.in);
		
		String directory = "src/Ex4/";
		String fileName = "numbers";
		String extension = ".txt";
		String filePath = directory.concat(fileName).concat(extension);
		
		//Making File Object
		File fileObj = new File(filePath);
	
		//Creating Source File
		try
		{
			if(fileObj.createNewFile())
			{
				System.out.println("File Created: " +fileObj.getName());
			
			}
			else
			{
				System.out.println("File Creation failed!");
			}
		
		}
		catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		//Writing to File
		try
		{
			FileWriter myWriter = new FileWriter(filePath);
		
			System.out.println("Enter Numbers: ");
			
			String number = input.nextLine();
			
			myWriter.write(number);
			myWriter.close();
		
		}
		catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
	
		//Reading File
		try
		{
			Scanner myReader = new Scanner(fileObj);
			int i=0;
			int sum=0,num=0;
	         while (myReader.hasNext())
	         {
	       
	             try
	             {
	                 num = Integer.parseInt(myReader.nextLine());
	             }
	             catch(NumberFormatException E)
	             {
	            	 
	             }
	             sum += num;
	             
	         }

	         myReader.close();
	         System.out.println("Sum = " +sum);
		}
		catch(FileNotFoundException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		//Delete File
		if(fileObj.delete())
		{
			System.out.println("File Deleted: " +fileObj.getName());
		}
		else
		{
			System.out.println("Failed to delete.");
		}
	
	
	
	}

}
