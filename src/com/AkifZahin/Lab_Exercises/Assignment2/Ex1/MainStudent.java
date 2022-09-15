package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;
import java.util.*;
public class MainStudent 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = input.nextInt();
		
		System.out.println("Enter Name: ");
		String name = input.next();
		
		System.out.println("Enter Year: ");
		String year = input.next();
		
		System.out.println("Enter CGPA: ");
		double cgpa = input.nextDouble();
		
		input.close();
		
		Student Akif = new Student(id,name,year,cgpa);
		
		Akif.setCgpa(3.97);
		
		System.out.println("" + Akif.toString());

	
	
	
	}

}
