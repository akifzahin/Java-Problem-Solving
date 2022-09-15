package com.AkifZahin.Lab_Exercises.Assignment1;
import java.io.*;
import java.util.*;
public class Ex1 
{

//	1.Write a Java program to copy files content to another.
	
	public static void main(String[] args) 
	{
		//Making File Name
		String directory = "src/Ex1";
		String fileName1 = "SourceFile";
		String fileName2 = "OutputFile";
		String extension = ".txt";
		
		String filePath1 = directory.concat("/").concat(fileName1).concat(extension);
		String filePath2 = directory.concat("/").concat(fileName2).concat(extension);
		
		//Creating File Object
		File fileObj1 = new File(filePath1);
		File fileObj2 = new File(filePath2); 
		
		//Creating Source and Output File
		try 
		{
			if(fileObj1.createNewFile())
			{
				System.out.println("File Created: " +fileObj1.getName());
			}
			else
			{
				System.out.println("Source File Creation Failed!");
			}
			
		} catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		try 
		{
			
			if(fileObj2.createNewFile())
			{
				System.out.println("File Created: " +fileObj2.getName());
			}
			else
			{
				System.out.println("Output File Creation Failed!");
			}
		} catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		//Writing Source File
		try
		{
			Scanner input = new Scanner(System.in);
			FileWriter myWriter = new FileWriter(filePath1);
			
			System.out.println("Enter contents: ");
			String contents = input.nextLine();
			input.close();
			
			myWriter.write(contents);
			myWriter.close();
		}
		catch(IOException E)
		{
			System.out.println("An error has occured while writing!");
			E.printStackTrace();
		}
		
		//File Reader for Source File
		try
		{
			Scanner fileReader = new Scanner(fileObj1);
			
			while(fileReader.hasNextLine())
			{
				String fileData = fileReader.nextLine();
				System.out.println("File reads: " +fileData);
			}
			fileReader.close();
		}catch(FileNotFoundException E)
		{
			System.out.println("ERROR!");
			E.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
