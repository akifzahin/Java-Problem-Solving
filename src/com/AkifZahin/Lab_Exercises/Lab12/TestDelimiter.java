package com.AkifZahin.Lab_Exercises.Lab12;

public class TestDelimiter {

	public static void main(String[] args)
	{
		String test1 = "{(a+b)*(c+d)}";
		String test2 = "{(a+b)+[x*(c+d)]}";
		String test3 = "{(a+b)+[x*(c+d)}}";
		
		DelimiterMatching myTest1 = new DelimiterMatching();
		DelimiterMatching myTest2 = new DelimiterMatching();
		DelimiterMatching myTest3 = new DelimiterMatching();
		
		myTest1.isDelimiterMatching(test1);
		myTest2.isDelimiterMatching(test2);
		myTest3.isDelimiterMatching(test3);
		
		
	}

}
