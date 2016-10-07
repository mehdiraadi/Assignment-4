package com.ex4.bank.superclasses;
/**
 * It is a superclass with 2 attributes
 * @author jasmi
 * 
 * */

public class Human {
	/**
	 * Attributes: String name, int age
	 * 
	 * */
	private String name;
	private int age;
	/**
	 * Constructor Human
	 * @param String name, int age
	 * */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * Getters and setters for the attributes
	 * 
	 * */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
