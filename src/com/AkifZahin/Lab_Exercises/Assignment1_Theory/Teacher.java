package com.AkifZahin.Lab_Exercises.Assignment1_Theory;


public class Teacher extends Employee
{
	
	private int number_of_courses;
	private int amount_per_course;
	
	
	
	public Teacher(String name, int base_salary, int number_of_courses, int amount_per_course) {
		super(name, base_salary);
		this.number_of_courses = number_of_courses;
		this.amount_per_course = amount_per_course;
	}


	 public boolean addCourse(int val)
	 {
		int result = this.number_of_courses+val;
		boolean isAdded = false;
		if(result<=5)
		{
			this.number_of_courses=result;
			return isAdded = true;
		}
		else
		{
			System.out.println("Course limit for " +getName()+" exceeded!");
		}
		return isAdded;
	 }
	
	 public boolean deleteCourse(int val)
	 {	
		 boolean isDeleted = false;
		 int result = this.number_of_courses-val;
			
			if(result>0)
			{
				this.number_of_courses=result;
				isDeleted = true;
			}
			else
			{
				System.out.println("Course size cannot be 0 for " +getName());
			}
			return isDeleted;
	 }
	 
	
	@Override
	public int salary() {
		return getBase_salary()+(number_of_courses*amount_per_course);
	}

	

	
	
}
