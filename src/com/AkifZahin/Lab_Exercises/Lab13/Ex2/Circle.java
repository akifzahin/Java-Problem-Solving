package com.AkifZahin.Lab_Exercises.Lab13.Ex2;

public class Circle extends GeometricObject
{
	private double radius;
	
	public Circle()
	{
		this.radius=0.0;
	}
	public Circle(double radius)
	{	
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color, boolean filled) 
	{
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getDiameter()
	{
		return radius*2;
	}
	
	public String printCircle() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getPerimeter()=" + getPerimeter()
				+ ", getArea()=" + getArea() + ", getDiameter()=" + getDiameter() + ", getColor()=" + getColor() + "]";
	}
	
	

}
