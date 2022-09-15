package com.AkifZahin.Lab_Exercises.Lab13.Ex2;

public class GeometricObject 
{
	private String color;
	private boolean filled;
	
	public GeometricObject()
	{
		this.color = "red";
		this.filled= true;
	}

	public GeometricObject(String color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
	}
//	public GeometricObject(String color)
//	{
//		this.color = color;
//	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + "]";
	}
	
	
}
