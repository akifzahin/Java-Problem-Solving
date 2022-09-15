package com.AkifZahin.Lab_Exercises.Lab13.Ex2;

public class Rectangle extends GeometricObject
{
	private double width;
	private double height;
	
	public Rectangle()
	{
		this.width = 0.0;
		this.height = 0.0;
	}

	public Rectangle(double width, double height) 
	{
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height,String color,boolean filled)
	{
		super(color,filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getPerimeter()
	{
		return 2*(width+height);
	}
	public double getArea()
	{
		return width*height;
	}
	public double getDiagonal()
	{
		return Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String printRectangle() 
	{
		return "Rectangle [getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + ", getPerimeter()="
				+ getPerimeter() + ", getArea()=" + getArea() + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + "]";
	}
	
}
