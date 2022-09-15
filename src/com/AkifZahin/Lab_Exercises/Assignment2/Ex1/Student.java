package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;

public class Student 
{
	private int id;
	private String name;
	private String year;
	private double cgpa;
	
	public Student(int id, String name, String year, double cgpa)
	{
		this.id = id;
		this.name = name;
		this.year = year;
		this.cgpa = cgpa;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear(String year) 
	{
		this.year = year;
	}

	public double getCgpa() 
	{
		return cgpa;
	}

	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	
	public void resetCGPA(double cgpa)
	{
		cgpa = 0.0;
	}

	@Override
	public String toString() 
	{
		return "Student [id= " + id + ", name= " + name + ", year= " + year + ", cgpa= " + cgpa + "]";
	}
	
	
	
}
