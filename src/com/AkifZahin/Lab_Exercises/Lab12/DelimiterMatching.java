package com.AkifZahin.Lab_Exercises.Lab12;

public class DelimiterMatching 
{
	public boolean isDelimiterMatching(String inputExpression)
	{
		
		Stack myStack = new Stack(inputExpression.length());
		
		for(int i=0; i<inputExpression.length(); i++)
		{
			char c = inputExpression.charAt(i);
			if(c == '(' || c == '{' || c == '[' )
			{
				myStack.Push(c);
			}
			else if( c == '(' && myStack.Pop() == ')' ||  c == '[' && myStack.Pop() == ']' ||  c == '{' && myStack.Pop() == '}'  );
			{
				return false;
			}
			
		}
		
		if(myStack.isStackEmpty() )
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}
