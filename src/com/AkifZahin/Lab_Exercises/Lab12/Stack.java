package com.AkifZahin.Lab_Exercises.Lab12;

public class Stack 
{
	private int stackSize;
	private char stackArr[];
	private int top;
	
	public Stack(int size)
	{
		size = stackSize;
		stackArr = new char[stackSize];
		top = -1;
	
	}
	
	public void Push(char item)
	{
		stackArr[++top] = item;
	}
	
	public char Pop()
	{
		char item = stackArr[top];
		stackArr[top] = '\0';
		top--;
		return item;
	}
	public char Peek()
	{
		return stackArr[top];
	}
	
	public boolean isStackEmpty()
	{
		return (top == -1);
	}
	public boolean isStackFull()
	{
		return (top== stackSize-1);
	}
	
	
}
