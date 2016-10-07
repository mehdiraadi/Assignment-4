package com.ex4.bank.classes;

import java.util.ArrayList;
import com.ex4.bank.superclasses.*;
/**
 * It is an extension of standard ArraList class and
 *  it is used to override the toString method
 * 
 * */
public class MyArrayList1 extends ArrayList<BankAccount>{
	@Override
/**
 * This method overerides the standard toString method of ArrayList
 * @return String
 * */
    public String toString() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += " " + this.get(i);
        }
        return result;
    }
    }
