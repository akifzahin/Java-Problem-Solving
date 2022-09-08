package com.AkifZahin.RandomProblems;
import java.util.Scanner;
public class CompoundInterest {
//Akif
	public static void main(String[] args) 
	{
		//Initializing Scanner
		Scanner input = new Scanner(System.in);
	
		//Asking user for respective inputs according to CI = P(1+R/100)^T
		System.out.println("Enter Principal Amount: ");
		double P = input.nextDouble(); 
		
		System.out.println("Enter Interest Rate: ");
		double R = input.nextDouble();
		
		System.out.println("Enter Time Span: ");
		double T = input.nextDouble();
		
		input.close();
		
		System.out.printf("Compound Interest: $%,.2f",ReturnCompoundInterest(P,R,T));
	}
	
	 public static double ReturnCompoundInterest(double p, double r, double t)
	 {
		 double compoundInterest = p*(Math.pow((1+r/100),t));
		 return compoundInterest;
	 }
	
	
	
}
