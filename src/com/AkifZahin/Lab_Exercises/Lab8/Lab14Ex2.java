package com.AkifZahin.Lab_Exercises.Lab8;
import java.util.*;
import java.io.*;
public class Lab14Ex2 {

	public static void main(String[] args) 
	{
		String path = "src\\lab14ex2_quiz.txt";
		File file = new File(path);
		
		Lab14Ex2_Quiz[] quiz = new Lab14Ex2_Quiz[5];
		int numOfStudents = 0;
		
		//Reading File
		
			try (Scanner reader = new Scanner(file))
			{
				while(reader.hasNextLine() )
				{
					int id = Integer.parseInt(reader.next());
					int marks = Integer.parseInt(reader.next());
					
					quiz[numOfStudents++] = new Lab14Ex2_Quiz(id,marks);
					
					
				}
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
				
			} catch(FileNotFoundException e)
			
			{
				e.printStackTrace();
			}
			
			
			for(int i=0; i<numOfStudents;i++)
			{
				System.out.println("" + quiz[i].toString());
			}
			
			
			int highest = quiz[0].getMarks();
			for(int i = 0; i < numOfStudents; i++) 
			{
				if(quiz[i].getMarks() > highest) 
				{
					highest = quiz[i].getMarks();
				}
				
			}
			
			for(int i = 0; i < numOfStudents; i++) 
			{
				if(quiz[i].getMarks() == highest)
				{
					System.out.println("Highest: " +quiz[i].getId() );
				}
			}
		
		
		
		
		
		
		
		
	

	
	
	
	}
}
