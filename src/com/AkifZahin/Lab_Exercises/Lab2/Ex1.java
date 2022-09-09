package com.AkifZahin.Lab_Exercises.Lab2;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		//1.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Enter c: ");
		int c = input.nextInt();
		
		
		int tmp1;
		tmp1 = a;
		a = c;
		c = b;
		b = tmp1;
		
		System.out.printf("a, b, c = %d, %d, %d",a,b,c);

		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
