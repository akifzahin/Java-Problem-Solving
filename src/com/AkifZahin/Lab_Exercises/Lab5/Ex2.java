//Take input of a N x N matrix and display the sum of its main diagonal element. N will also be input.
//Example: For the following matrix, your program should display 12. (Because 5+3+4 = 12)

package com.AkifZahin.Lab_Exercises.Lab5;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) 
	{
		int i,j,size,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size: ");
		size = input.nextInt();
		
		int[][] Array_1 = new int[size][size];
		
		System.out.println("Enter values: ");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				Array_1[i][j] = input.nextInt();
			}
		}
	
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(i==j)
				{
					sum+=Array_1[i][j];
				}
			}
		}
		
		System.out.println("Sum = " + sum);
	
	
	
	}

}
