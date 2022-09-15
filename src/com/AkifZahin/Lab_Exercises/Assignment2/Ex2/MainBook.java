package com.AkifZahin.Lab_Exercises.Assignment2.Ex2;

public class MainBook {

	public static void main(String[] args) 
	{
		Address myAddress1 = new Address("Akif Zahin","H","A","R","1001");
		Author myAuthor1 = new Author("jk rowling",45,myAddress1);
		Book book1 = new Book("harry potter",786.12,myAuthor1);
		
		System.out.println("" + book1.toString());
		book1.setPrice(500.5);
		System.out.println("" + book1.getPrice());
	}
	

}
