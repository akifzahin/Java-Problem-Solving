package com.AkifZahin.Lab_Exercises.Assignment2.Ex2;

public class MainStudent 
{

	public static void main(String[] args) 
	{
		
		Address myAddress1 = new Address("Akif","H-46,R-20,S-11","Dhaka","Uttara","10001");
		Student student1 = new Student(213,"Aman","Afif",3.98,myAddress1);
		
		
		System.out.println("" + student1.toString());
		
		
	}

}
