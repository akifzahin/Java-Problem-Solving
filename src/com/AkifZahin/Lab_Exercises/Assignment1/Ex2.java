package com.AkifZahin.Lab_Exercises.Assignment1;
import java.io.*;
import java.util.*;

public class Ex2 {
//	2. Write a Java program which writes your name, id, number of semester
//	and cgpa into a file and then retrieves data from the file and shows it
//	into the console.

	public static void main(String[] args) 
	{
		//Making File Name
		String directory = "src/Ex2/";
		String fileName = "MainFile";
		String extension = ".txt";
		//mainfolder/subfolder/filename.extension
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
				System.out.println("Source File creation failed!");
			}
		}
		catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		//Writing Source File
		try
		{
			Scanner input = new Scanner(System.in);
			FileWriter myWriter = new FileWriter(filePath);
			
			System.out.println("Enter name: ");
			String name = input.nextLine();
			
			System.out.println("Enter Number of Semesters: ");
			String sem_num = input.nextLine();
		
			System.out.println("Enter ID: ");
			String id = input.nextLine();
			
			System.out.println("Enter CGPA: ");
			String cgpa =  input.nextLine();
			
			input.close();
			
			myWriter.write(name);
			myWriter.write(sem_num);
			myWriter.write(id);
			myWriter.write(cgpa);
			
			myWriter.close();
		}
		catch(IOException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		
		//File Reader
		try
		{
			Scanner fileReader = new Scanner(fileObj);
			while(fileReader.hasNextLine())
			{
				String fileData = fileReader.nextLine();
				System.out.println("File reads: " +fileData);
			}
			fileReader.close();
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
