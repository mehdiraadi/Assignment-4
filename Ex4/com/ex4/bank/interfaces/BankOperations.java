package com.ex4.bank.interfaces;
/**This is an interface which has 2 unimplemented methods 
 * method withdrawMoney used to withdraw money from account.
 * @param double amount.
 * method depositMoney used to deposit money to an account.
 * @param double amount
 * */
public interface BankOperations {
	public void withdrawMoney(double amount);
	public void depositMoney(double amount);
		
	

}
