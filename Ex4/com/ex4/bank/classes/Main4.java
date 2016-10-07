package com.ex4.bank.classes;

import com.ex4.bank.superclasses.*;
import com.ex4.bank.classes.*;
/**
 * This is the main program implementing the bank system.
 * @author jasmi
 * 
 * */

public class Main4 {
	public static void main(String[] args){
		
		String account="";
		/**
		 * Creating an object of class BankCustomer and call all the
		 *  functions to get and print the Customer account details.
		 * 
		 * 
		 * */
		BankCustomer bc=new BankCustomer("Jasmi", 30);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingsAccount());
		System.out.println(bc.toString());
		account=bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to first account");
		bc.depositeToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		account=bc.getCustomerAccounts().get(1).getAccountNumber();
		System.out.println("withdrawing 200.0 from the first account");
		bc.withdrawMoneyFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		account=bc.getCustomerAccounts().get(2).getAccountNumber();
		System.out.println("depositing 200.0 to the first");
		bc.depositeToAccount(account, 200.0);
		System.out.println(bc.toString());
		
		
	}

}
