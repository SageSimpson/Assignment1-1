package com.meritamerica.assignment1;

public class CheckingAccount {
	double balance, interestRate = 0.0001;
	int years = 3;
	
	
	CheckingAccount(double openingBalance){
		this.balance = openingBalance;
		
	}
//this a message	
	public double getBalance() {
	return this.balance;
	}
	
	public double getInterestRate() {
		
		return this.interestRate;
	}
	
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
    		
    		return "Cheking Account Balance: $" + this.balance + "Checking Account Interest Rate: " + this.interestRate + "Checking Account Balance in 3 years: " + this.years;
    	}
	
}