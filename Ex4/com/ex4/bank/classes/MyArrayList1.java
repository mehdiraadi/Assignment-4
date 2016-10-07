package com.ex4.bank.classes;

import java.util.ArrayList;

import com.ex4.bank.superclasses.*;
public class MyArrayList1 extends ArrayList<BankAccount>{
	@Override

    public String toString() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += " " + this.get(i);
        }
        return result;
    }
    }
