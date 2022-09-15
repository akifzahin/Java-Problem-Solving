package com.AkifZahin.Lab_Exercises.Assignment2.Ex2;

public class Student 
{
	private int ID;
	private String firstName;
	private String lastName;
	private double CGPA;
	private Address address;
	
	public Student(int ID, String firstName, String lastName, double CGPA, Address address) 
	{
		
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.CGPA = CGPA;
		this.address = address;
		
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int ID) 
	{
		this.ID = ID;
		
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public double getCGPA() 
	{
		return CGPA;
	}

	public void setCGPA(double CGPA) 
	{
		this.CGPA = CGPA;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Student [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", CGPA=" + CGPA
				+ ", address=" + address + "]";
	}
	
	

	
	
	
	
}
