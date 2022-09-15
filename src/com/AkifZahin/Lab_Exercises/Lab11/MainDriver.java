package com.AkifZahin.Lab_Exercises.Lab11;

import java.util.Scanner;

public class MainDriver {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		int ID = input.nextInt();
		
		System.out.println("Enter balance: ");
		double amount = input.nextDouble();
		
		Account account1 = new Account(ID,amount);
		
		System.out.println("Account Details: " +account1.toString());
		System.out.println("Account Number = " +account1.getAccountNumber());
		System.out.println("Balance = " +account1.getBalance());
		
		System.out.println("Enter amount to add: ");
		double creditAmount = input.nextDouble();
		account1.Credit(creditAmount);
		
		System.out.println("Enter amount to withdraw: ");
		double debitAmount = input.nextDouble();
		account1.Debit(debitAmount);
	}
}
