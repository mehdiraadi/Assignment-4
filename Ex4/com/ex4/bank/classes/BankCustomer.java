package com.ex4.bank.classes;
import java.util.ArrayList;



import com.ex4.bank.superclasses.BankAccount;
import com.ex4.bank.superclasses.Human;


public class BankCustomer extends Human 
{
	
	public BankCustomer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	MyArrayList1/*<BankAccount>*/customerAccounts=new MyArrayList1/*<BankAccount>*/();

	public MyArrayList1/*<BankAccount>*/ getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(MyArrayList1/*<BankAccount> */customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
 public void addAccount(BankAccount e){
	 customerAccounts.add(e);
 }
 public void depositeToAccount(String accountNumber, double amount){
	 for(int i=0;i<customerAccounts.size();i++){
		 if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
			 customerAccounts.get(i).depositMoney(amount);
		 }
	 }
	 
 }
 public void withdrawMoneyFromAccount(String accountNumber, double amount){
	 for(int i=0;i<customerAccounts.size();i++){
		 if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
			 customerAccounts.get(i).withdrawMoney(amount);
		 }
	 }
	 
 }

@Override
public String toString() {
	return "Customer: ["+getName()+" , "+getAge()+"]\n"+customerAccounts ;
}



	         
}





	

 
		
	
	
	
	


