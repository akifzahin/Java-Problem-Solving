//Take N students’ marks as input and store them in array. Then find the average marks. Finally, find
//and print how many of them got above average marks and how many of them got below the average.

package com.AkifZahin.Lab_Exercises.Lab5;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int i,j,size,sum=0,count1=0,count2=0;
		double average=0;
		System.out.println("Enter number of students: ");
		size = input.nextInt();
		
		int[] marks = new int[size];
		
		for(i=0;i<size;i++)
		{
			System.out.printf("Enter marks of students %d : ",i+1);
			marks[i] = input.nextInt();
		}
	
		for(i=0; i<size; i++)
		{
			sum+=marks[i];
			average = (double)sum/size;
		}
		System.out.printf("Average = %.2f",average);
		for(i=0; i<size; i++)
		{
			if(marks[i]>average)
			{
				count1++;
			}
		}
		
		for(i=0; i<size; i++)
		{
			if(marks[i]<average)
			{
				count2++;
			}
		}
		
		System.out.printf("\n%d of them got above average.",count1);
		System.out.printf("\n%d of them got below average.\n",count2);
	}

}
