package com.AkifZahin.Lab_Exercises.Assignment1;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex6 
{

	public static void main(String[] args) 
	{
		String filePath = "src/Ex6/words.txt";
		
		//File Object
		File fileObj = new File(filePath);
		
		//Reading File
		try
		{
			Scanner fileReader = new Scanner(fileObj);
			while(fileReader.hasNext())
			{
				String fileData = fileReader.nextLine();
				System.out.println("File Reads: " +fileData);
			}
			fileReader.close();
		}
		catch(FileNotFoundException E)
		{
			System.out.println("Critical Error!");
			E.printStackTrace();
		}
		
		
	
	}

	
	
}
