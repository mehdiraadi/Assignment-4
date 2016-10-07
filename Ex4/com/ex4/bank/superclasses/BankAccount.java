package com.ex4.bank.superclasses;


import java.util.UUID;
import com.ex4.bank.interfaces.BankOperations;
/**
 * This is a superclass which implements interface BankOperations methods
 * @author jasmi
 * 
 * 
 * */

public class BankAccount implements BankOperations {
	/**
	 * Attributes
	 * String accountNumber, String accountType, double balance
	 * */
	private String accountNumber;
	private String accountType;
	private double balance;
	/**
	 * Constructor BankAccount
	 * 
	 * */
	public BankAccount(){
		this.accountNumber=UUID.randomUUID().toString().substring(0,6);
		this.balance=0.0;
		this.accountType="Bank Account";
	}
	/**
	 * getter for attribute accountNumber to get accountNumber
	 * @return String
	 * */

	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * setter for the attribute accountNumber to set accountNumber
	 * @param String accountNumber
	 * */

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * getter for attribute accountType to get accountType
	 * @return String
	 * 
	 * */

	public String getAccountType() {
		return accountType;
	}
	/**
	 * setter for the attribute accountType to set accountType
	 * @param String accountType
	 * 
	 * 
	 * */

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * getter for attribute balance to get balance 
	 * @return double
	 * */

	public double getBalance() {
		return balance;
	}
    /**
     * setter for the attribute balance
     * @param double balance
     * */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	/**
	 * method withdrawMoney of the interface BankOperations implements here
	 * 
	 * */
	public void withdrawMoney(double amount) {
		if(amount>=0){
			setBalance(getBalance()-amount);
		}
		else{
			System.out.println("You cannot withdraw a negative value");
		}
		
	}


	@Override
	/**
	 * method depositMoney of the interface BankOperations implements here
	 * */
	public void depositMoney(double amount) {
		if(amount>=0){
			setBalance(getBalance()+amount);
			
		}
		else{
			System.out.println("You cannot deposite negative value");
		}
		
		
	}

	@Override
	/**
	 * toString method to print the account details
	 * @return String
	 * */
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]\n";
	}
	
	

}
