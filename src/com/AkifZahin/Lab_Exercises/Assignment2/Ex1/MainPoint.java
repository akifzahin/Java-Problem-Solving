package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;

public class MainPoint 
{

	public static void main(String[] args) 
	{
		Point point1 = new Point(5.4,3.6,7.8);
		Point point2 = new Point(2.1,4.5,3.6);
		
		System.out.println("" + point1.distanceTo(point1));
		System.out.println("" + point1.distanceTo(point1, point2));
	}

}
