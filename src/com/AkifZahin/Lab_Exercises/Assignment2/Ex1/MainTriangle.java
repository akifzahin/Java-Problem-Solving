package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;

public class MainTriangle {

	public static void main(String[] args) 
	{
		int s1 = 5, s2 = 3, s3 = 6;
		
		Triangle triangle1 = new Triangle(s1,s2,s3);
		
		System.out.println("" + triangle1.is_RightAngle());
		System.out.println("" + triangle1.is_Scalene());
		System.out.println("" + triangle1.is_Isosceles());
		System.out.println("" + triangle1.is_Equilateral());

	}

}
