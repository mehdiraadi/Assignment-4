package com.ex4.bank.superclasses;


import java.util.UUID;

import com.ex4.bank.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	String accountNumber;
	String accountType;
	double balance;
	
	public BankAccount(){
		this.accountNumber=UUID.randomUUID().toString().substring(0,6);
		this.balance=0.0;
		this.accountType="Bank Account";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdrawMoney(double amount) {
		if(amount>=0){
			setBalance(getBalance()-amount);
		}
		else{
			System.out.println("You cannot withdraw a negative value");
		}
		
	}


	@Override
	public void depositMoney(double amount) {
		if(amount>=0){
			setBalance(getBalance()+amount);
			
		}
		else{
			System.out.println("You cannot deposite negative value");
		}
		
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]\n";
	}
	
	

}
