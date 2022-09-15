package com.AkifZahin.Lab_Exercises.Lab8;
import java.util.*;
import java.io.*;
public class Lab14Ex1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String path = "src\\lab14ex1.txt";
		File myFile = new File(path);
		int n = 0;
		int[] intArray = new int[10];
		try
		{
			if(myFile.createNewFile())
			{
				System.out.println("Created");
			}
			else
			{
				System.out.println("Exists!");
			}
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		//Writing to File
		System.out.println("Input numbers: ");
		
		try 
		{
			
			FileWriter fileWriter = new FileWriter(myFile);
			while(n>=0)
			{
				n = input.nextInt();
				
				if(n<0)
				{
					System.out.println("Input Done!");
					break;

				}
				fileWriter.write(""+n+"\n");
			}
		fileWriter.close();
		input.close();
		
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		//Reading File
		
		try 
		{
			Scanner scanner = new Scanner(myFile);
			int i=0;
			while(scanner.hasNextInt())
			{
				
				intArray[i++] = scanner.nextInt();
			
			}
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size crossed!");
		}
		
		System.out.println("Array: " + Arrays.toString(intArray));
		
		//Sum and Average
		double sum=0,average=0,count=0;
		for(int i=0;i<intArray.length;i++)
		{
			if(intArray[i]>0)
			{
				count++;
				sum+=intArray[i];
				average = sum/count;
			}
			
		}
		
		System.out.println("Sum: "+sum+"\nAverage: "+average);
		
	}
}
	
