package com.ex4.bank.classes;
import java.util.UUID;

import com.ex4.bank.superclasses.BankAccount;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("saving account");
	}
	

}
