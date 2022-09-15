package com.AkifZahin.Lab_Exercises.Lab13.Ex1;

public class Cylinder extends Circle
{
	private double height;
	
	public Cylinder()
	{
		this.height = 1.0;
	}

	public Cylinder(double height)
	{
		super();
		this.height = height;
	}
	public Cylinder(double height,double radius)
	{
		super(radius);
		this.height = height;
		
	}
	
	public Cylinder(double height,double radius, String color) 
	{
		super(radius, color);
		this.height = height;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume()
	{
		return Math.PI*getRadius()*getRadius()*height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getRadius()=" + getRadius() + ", getColor()=" + getColor() + "]";
	}
	
	
}
