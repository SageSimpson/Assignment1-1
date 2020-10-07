package com.meritamerica.assignment1;
import java.lang.Math;

public class SavingsAccount {
	
	double balance, interestRate = 0.01;
	int years = 3;
	

	
	SavingsAccount(double openingBalance){
		this.balance = openingBalance;
		
	}
	

	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double openingBalance) {
		this.balance = openingBalance;
	}
	
	
	public double getInterestRate() {
		
		return this.interestRate;
	}
	
//	public void setInterestRate(double InterestRate) {
//		this.interestRate = InterestRate;
//	}
	
	public boolean withdraw(double amount) {
		if(amount < 0 || amount > this.balance) {
			return false;
		}else {
			this.balance -= amount;
			return true;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount < 0 ) {
			return false;
		}else {
			this.balance += amount;
			return true;
		}
	}
	
	public double futureValue(int years) {
	return this.balance * Math.pow(1 + this.interestRate, years);
		
		
	}
	
	public String toString() {
		
		return "Savings Account Balance: $" + this.balance + "Saving Account Interest Rate: " + this.interestRate + "Saving Account Balance in 3 years: " + this.years;
	}

	
}