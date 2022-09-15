package com.AkifZahin.Lab_Exercises.Lab8;

public class Lab14Ex2_Quiz 
{
	private int id,marks;

	public Lab14Ex2_Quiz(int id, int marks) 
	{
		this.id = id;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", marks=" + marks + "]";
	}
	
}
