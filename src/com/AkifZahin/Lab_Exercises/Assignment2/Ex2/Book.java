package com.AkifZahin.Lab_Exercises.Assignment2.Ex2;

public class Book 
{
	private String name;
	private double price;
	private Author author;
	
	public Book(String name, double price, Author author)
	{
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}

	
	
	
}
