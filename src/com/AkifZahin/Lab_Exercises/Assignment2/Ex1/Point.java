package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;

public class Point 
{
	private double x,y,z;

	public Point(double x, double y, double z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}


	public double getZ() 
	{
		return z;
	}
	
	public double distanceTo(Point p)
	{
		return Math.sqrt( Math.pow(p.x-0, 2) + Math.pow(p.y-0, 2) + Math.pow(p.z-0, 2)     );

	}
	public double distanceTo(Point p, Point q)
	{
		return Math.sqrt( Math.pow(q.x-p.x, 2) + Math.pow(q.y-p.y, 2) + Math.pow(q.z-p.z, 2)     );
	}
	@Override
	public String toString() 
	{
		return "Point [ x= " + x + ", y = " + y + ", z = " + z + "]";
	}
	
	
}
