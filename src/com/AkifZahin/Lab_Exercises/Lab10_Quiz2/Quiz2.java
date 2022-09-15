package com.AkifZahin.Lab_Exercises.Lab10_Quiz2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) 
	{
		String path = "src\\input.txt";
		File file = new File(path);
		
		
		try 
		{
			Scanner reader = new Scanner(file);
			while(reader.hasNext())
			{
				String word1 = reader.next();
				String word2 = reader.next();
				System.out.println( ""+isAnagram(word1,word2));  
			}
			reader.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	public static boolean isAnagram(String w1, String w2)
	{
		char[] charArray1 = w1.toCharArray();
		char[] charArray2 = w2.toCharArray();
		
		Arrays.sort(charArray2);
		Arrays.sort(charArray1);
		
		boolean isAnagram = false;
		if(Arrays.equals(charArray1, charArray2) && (charArray1.length == charArray2.length))
		{
			isAnagram = true;
			
		}
		return isAnagram;
		
		
	}
}
