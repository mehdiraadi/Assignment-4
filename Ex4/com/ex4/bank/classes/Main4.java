package com.ex4.bank.classes;

import com.ex4.bank.superclasses.*;
import com.ex4.bank.classes.*;

public class Main4 {
	public static void main(String[] args){
		
		/*BankAccount bankAccount=new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);
		
		PersonalAccount pa= new PersonalAccount();
		pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);
		
		
		SavingsAccount sv= new SavingsAccount();
		sv.withdrawMoney(-20);
		sv.withdrawMoney(20);
		System.out.println(sv.toString());*/
		
		
		String account="";
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
