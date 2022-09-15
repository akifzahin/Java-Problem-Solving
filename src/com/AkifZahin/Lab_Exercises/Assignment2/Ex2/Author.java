package com.AkifZahin.Lab_Exercises.Assignment2.Ex2;

public class Author
{
	private String authorName;
	private int age;
	private Address address;
	
	public Author(String authorName, int age, Address address) 
	{
		this.authorName = authorName;
		this.age = age;
		this.address = address;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", address=" + address + "]";
	} 
	
	
	
	
	
	
	
}
