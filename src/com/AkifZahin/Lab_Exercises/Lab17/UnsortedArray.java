package com.AkifZahin.Lab_Exercises.Lab17;

public class UnsortedArray<E>
{
	private final int MAX_ITEMS = 5;
	private int length,currentPOS;
	@SuppressWarnings("unchecked")
	E[] Info = (E[]) new Object[MAX_ITEMS];
	
	public UnsortedArray() 
	{
		this.length = 0;
		this.currentPOS = -1;
	}
	
	public void makeEmpty()
	{
		length = 0;
		
	}
	
	public boolean isFull()
	{
		return (length==MAX_ITEMS);
	}

	public int lengthIs()
	{
		return length;
	}
	
	public void resetList()
	{
		this.currentPOS = -1;
		
	}
	
	public void insertItem(E item)
	{
		
		Info[length++] = item;
		this.currentPOS++;
		
			

	}
	
	public void deleteItem(E item)
	{
		int index = getItemIndex(item);
		
		Info[length--] = Info[index];
		
		
		
	}
	
	public int getItemIndex(E item)
	{
		int index = -1;
		for(int i=0; i<Info.length; i++)
		{
			if(Info[i].equals(item) )
			{
				index = i;
			}
		}
		return index;
	}
	
	public E getNextItem()
	{
		return Info[length++];
	}
	
}
