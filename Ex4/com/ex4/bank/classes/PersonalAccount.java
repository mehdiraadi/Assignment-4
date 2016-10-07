package com.ex4.bank.classes;
import java.util.UUID;
/**
 * class PersonalAccount is a subclass of BankAccount.
 * @author jasmi
 * 
 * */

import com.ex4.bank.superclasses.BankAccount;


public class PersonalAccount extends BankAccount {
	/**
	 * Method PersonalAccount is used to set a personal account.
	 * 
	 * */
public PersonalAccount(){
	this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
	this.setBalance(0.0);
	this.setAccountType("Personal Account");
}
}
