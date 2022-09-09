//In this task, you will find the transpose of a matrix. Read two integers, m, and n, from the user. These
//are the dimensions of the matrix. Next, read the elements of the matrix from the user. Then, print
//the transpose of the matrix.

package com.AkifZahin.Lab_Exercises.Lab5;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,j;
		
		System.out.println("Enter rows: ");
		int row = input.nextInt();
		
		System.out.println("Enter columns: ");
		int col = input.nextInt();
		
		int[][] Array_1 = new int[row][col];
		
		System.out.println("Enter elements: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				Array_1[i][j] = input.nextInt();
			}
		}
		
		int[][] Array_2 = new int[col][row];
		
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				Array_1[j][i] = Array_2[i][j];
			}
		}
		
			for(i=0; i<col; i++) 
		{
			for(j=0; j<row; j++)
			{
				System.out.printf("%d\t",Array_2[i][j]);
			}
		}
	
	
	
	}

}
