package com.AkifZahin.Lab_Exercises.Lab11;
import java.util.*;
import java.io.*;
public class Account 
{
	private int accountNumber;
	private double balance=0.0;
	
	public Account(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	public Account(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	@Override
	public String toString()
	{
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	public void Credit(double amount)
	{
		this.balance = amount+this.balance;
		System.out.println("New Balance: " +this.balance);
	}
	public void Debit(double amount)
	{
		if(balance >= amount)
		{
			balance-=amount;
			System.out.println("New Balance: " + balance); 
		}
		else
		{
			System.out.println("Not Allowed!");
		}
	}
	
	
	
	
	

}
