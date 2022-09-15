package com.AkifZahin.Lab_Exercises.Assignment1_Theory;


public abstract class Employee implements Comparable<Employee>
{
	
	private String name;
	private int base_salary;
	

	public Employee(String name, int base_salary)
	{
		this.name = name;
		this.base_salary = base_salary;
	}
	


	public String getName() {
		return name;
	}


	public abstract int salary();


	public void setBase_salary(int base_salary) {
		this.base_salary = base_salary;
	}
	
	public int getBase_salary() {
		return this.base_salary;
	}

	@Override
	public int compareTo(Employee e)
	{
		return this.salary() - e.salary();
	}
	

}

