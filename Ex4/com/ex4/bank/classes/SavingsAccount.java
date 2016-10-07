package com.ex4.bank.classes;
import java.util.UUID;
/**
 * class SavingsAccount is a subclass of superclass BankAccount.
 * @author jasmi
 * */

import com.ex4.bank.superclasses.BankAccount;

public class SavingsAccount extends BankAccount{
	/**
	 * method SavingsAccount is used to set a Savings account
	 * 
	 * */
	public SavingsAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("saving account");
	}
	

}
