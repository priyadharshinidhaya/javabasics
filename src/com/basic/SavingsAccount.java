package com.basic;

public class SavingsAccount {
	static double annualInterestRate=4;
	double savingsBalance;
	
	
	
	public void calculateMonthlyInterest(double savingsBalance)
	{
		
		this.savingsBalance=savingsBalance;
		savingsBalance=(savingsBalance*(annualInterestRate/100)/12)+savingsBalance;
		System.out.println("savings balance"+savingsBalance);
	}
	public static void modifyInterestRate(float newValue)
	{
		annualInterestRate=newValue;
		
	}
	public static void main(String[] args)
	{
		System.out.println(annualInterestRate); 
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.calculateMonthlyInterest(1000);
		saver2.calculateMonthlyInterest(2000);
		SavingsAccount.modifyInterestRate(5);
		saver1.calculateMonthlyInterest(1000);
		saver2.calculateMonthlyInterest(2000);
		
		
		
	}
	

}