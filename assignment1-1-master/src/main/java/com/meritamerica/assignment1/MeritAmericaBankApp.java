package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class MeritAmericaBankApp {
	
public static void main(String[] args) {
		
		AccountHolder adrian = new AccountHolder("Adrian", "Jesus", 
				"Cervantes", "XXX-XX-2222", 100.00, 400.00);
		AccountHolder juan = new AccountHolder("Juan", "Pablo", "Cervantes", "XXX-XX-3333", 200.00, 500.00);
		System.out.println("Name: " + adrian.firstName + " " + adrian.lastName);
		System.out.println("SSN: " + " " + adrian.ssn + " ");
		
		
		adrian.getCheckingAccount().deposit(10000);
		
		System.out.println("Checking Balance: $" + adrian.getCheckingAccount().getBalance());
		System.out.println("Savings Balance: $" + adrian.getSavingsAccount().getBalance());
		System.out.println();
		
		
		juan.getSavingsAccount().withdraw(100);
		juan.getSavingsAccount().withdraw(100);
		juan.getSavingsAccount();
		System.out.println("Name: " + juan.firstName + " " + juan.lastName);
		System.out.println("SSN: " + " " + juan.ssn + " ");
		System.out.println("Checking Balance: $" + juan.getCheckingAccount().getBalance());
		System.out.println("Savings Balance: $" + juan.getSavingsAccount().getBalance());
		DecimalFormat my = new DecimalFormat("0.00");
		System.out.println("Savings Balance Future Value Interest Rate: $" + my.format(juan.getSavingsAccount().futureValue(3)));
		
		
		
//		SavingsAccount check = new SavingsAccount(100);
//		System.out.println("Checking Account Balance: $" + check.balance);
//		System.out.println("Checking Account Interest Rate: " + check.interestRate);
//		DecimalFormat df = new DecimalFormat("0.00");
//		System.out.println("Checking Account Balance in 3 years: " + df.format(check.futureValue(3)));
//		SavingsAccount money = new SavingsAccount(1000.00);
//		System.out.println("Saving Account Balance: $" + money.balance);
//		System.out.println("Saving Account Interest Rate: " + money.interestRate);
//		DecimalFormat my = new DecimalFormat("0.00");
//		System.out.println("Saving Account Balance in 3 years: " + my.format(money.futureValue(3)));
		
	}
	
}