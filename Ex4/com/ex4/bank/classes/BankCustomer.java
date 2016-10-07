package com.ex4.bank.classes;

import java.util.ArrayList;

import com.ex4.bank.superclasses.BankAccount;
import com.ex4.bank.superclasses.Human;

/***
 * 
 * This class is a subclass of superclass Human
 * 
 * @author jasmi
 * @version 1.0
 * 
 * 
 */

public class BankCustomer extends Human {
	/***
	 *
	 * 
	 * constructor to the class BankCustomer
	 * 
	 * @param String name, int age
	 *
	 *
	 */

	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/**
	 * 
	 * creating an object of class MyArrayList1
	 * 
	 */

	MyArrayList1 customerAccounts = new MyArrayList1();

	/**
	 * method getCustomerAccounts
	 * 
	 * @return MyArrayList1
	 */

	public MyArrayList1 getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * method setCustomerAccounts
	 * 
	 * @param MyArrayList1,
	 *            customerAccounts
	 */

	public void setCustomerAccounts(MyArrayList1 customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	/**
	 * method addAccount add BankAccount to an arrayList
	 * @param Bankaccount 
	 * */

	public void addAccount(BankAccount ba) {
		customerAccounts.add(ba);
	}
	/**
	 * method depositeToAccount is used to deposit an amount to an account
	 * @param String accounNumber, double amount
	 * */

	public void depositeToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}

	}
	/**
	 * method withdrawFromAccount is used to withdraw an amount from an account
	 * @param String accounNumber, double amount
	 * 
	 * */

	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}

	}

	@Override
	/**
	 * toString method used to print the details of a bank account of a specific customer
	 * @return String
	 * */
	public String toString() {
		return "Customer: [" + getName() + " , " + getAge() + "]\n" + customerAccounts;
	}

}
