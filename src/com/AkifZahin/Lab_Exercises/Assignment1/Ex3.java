package com.AkifZahin.Lab_Exercises.Assignment1;
import java.io.*;
import java.nio.*;
import java.util.*;

//Write a Java program to read the first N lines from a file and show them in
//the console. N should come from user input

public class Ex3 

{		
	
	public static void main(String[] args) 
	{
		//Making File Name
			Scanner input = new Scanner(System.in);
			String directory = "src/Ex3/";
			String fileName = "MainFile";
			String extension = ".txt";
				
			String filePath = directory.concat(fileName).concat(extension);
				
			//Making File Object
			File fileObj = new File(filePath);
				
//			//Creating Source File
//			try 
//			{
//				if(fileObj.createNewFile())
//				{
//					System.out.println("File Created: " +fileObj.getName());
//						
//				}
//				else
//				{
//					System.out.println("Source File creation failed!");
//				}
//			}
//			catch(IOException E)
//			{
//				System.out.println("Critical Error!");
//				E.printStackTrace();
//			}

//			//Writing Source File
//			try
//			{
//				
//				FileWriter myWriter = new FileWriter(filePath);
//				
//				System.out.println("Enter contents: ");
//				String contents = input.nextLine();
//				
//				
//				myWriter.write(contents);
//				myWriter.close();
//				
//			}
//			catch(IOException E)
//			{
//				System.out.println("Critical Error Occured!");
//				E.printStackTrace();
//			}
			//Taking N input
			System.out.println("Enter N Lines: ");
			int N = input.nextInt();
			
			
			//Reading File
			try
			{
				Scanner myReader = new Scanner(fileObj);
				while(myReader.hasNextLine())
				{
					for(int i=0; i<=N; i++ )
					{
						String fileData = myReader.nextLine();
						System.out.println("File reads: " +fileData);
					}
				}
				myReader.close();
			} 
			catch(FileNotFoundException E)
			{
				System.out.println("FILE NOT FOUND!");
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
