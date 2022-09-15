package com.AkifZahin.Lab_Exercises.Assignment2.Ex1;

public class Triangle 
{
	private int side1,side2,side3;

	public Triangle(int side1, int side2, int side3) 
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int getSide1() 
	{
		return side1;
	}

	public void setSide1(int side1)
	{
		this.side1 = side1;
	}

	public int getSide2() 
	{
		return side2;
	}

	public void setSide2(int side2)
	{
		this.side2 = side2;
	}

	public int getSide3() 
	{
		return side3;
	}

	public void setSide3(int side3)
	{
		this.side3 = side3;
	}
	
	public boolean is_RightAngle()
	{
		if( (side1*side1 + side2*side2)>(side3*side3) || (side1*side1 + side3*side3)>(side2*side2) || (side2*side2 + side3*side3)>(side1*side1)   )
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean is_Scalene()
	{
		if(side1!=side2 && side1!=side3 && side2!=side3)
		{
			return true;
		}
		else
		{
			return false;
		}
			
			
	}
	
	public boolean is_Isosceles()
	{
		if(side1==side2 || side1==side3 || side2==side3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean is_Equilateral()
	{
		if(side1==side2 && side2==side3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
}
	
	

