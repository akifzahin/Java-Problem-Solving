package com.AkifZahin.Lab_Exercises.Lab10_Quiz2;
import java.util.*;
import java.io.*;
public class Ex1 
{	

		
	
		private String courseName; 
	    private String[] students; 
	    private int numberOfStudents; 
	 
	    public Ex1(String courseName) 
	    { 
	        this.courseName = courseName; 
	        students = new String[3]; 
	        numberOfStudents = 0; 
	        
	        
	    } 
	     public String getCourseName()
	     {
	    	 return courseName;
	     }
	     public String[] getStudents()
	     {
	    	 return students;
	     }
	     public int getNumberofStudents()
	     {
	    	 return numberOfStudents;
	     }
	     
	     public static void dropMethod(String name)
	     {
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter course name: ");
		String courseName = input.next();
		
		Ex1 course1 = new Ex1(courseName);
		
		System.out.println("Course Name: " +course1.getCourseName());
		
		System.out.println("Enter student name to drop: ");
		String dropName = input.next();
	
	
	
	}

}
