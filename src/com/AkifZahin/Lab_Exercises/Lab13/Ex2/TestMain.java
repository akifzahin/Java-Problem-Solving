package com.AkifZahin.Lab_Exercises.Lab13.Ex2;

public class TestMain {

	public static void main(String[] args) 
	{
		Circle circle1 = new Circle(1.0,"yellow",true);
		System.out.println(circle1.getArea());
		System.out.println(circle1.getPerimeter());
		
		Rectangle rectangle1 = new Rectangle(3.0,4.0,"yellow",true);
		
		System.out.println(rectangle1.getDiagonal());
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.printRectangle());
		
	}

}
