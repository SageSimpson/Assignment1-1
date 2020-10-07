package com.meritamerica.assignment1;

public class AccountHolder {
	
	
	String firstName, middleName, lastName, ssn;
	
	CheckingAccount checkingAccount = null;
	SavingsAccount savingsAccount = null;
   
	
	
	public AccountHolder(String firstName, String middleName, 
			String lastName, String ssn, double CheckingAccount, double SavingsAccount){
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.ssn = ssn;      
	        this.checkingAccount = new CheckingAccount(CheckingAccount);
	        this.savingsAccount = new SavingsAccount(SavingsAccount);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		
	}
	
	public CheckingAccount getCheckingAccount(){
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	

	
	public String toString() {
		
		return this.toString();
//		return firstName+" " + middleName + " " + lastName + " " + ssn;
	}
	

}