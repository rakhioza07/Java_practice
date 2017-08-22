package com.corejava.file;

import java.io.Serializable;
import com.corejava.collection.*;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Account(int no, double balance, String name) {
		super();
		this.no = no;
		this.balance = balance;
		this.name = name;
	}
	private int no;
	private double balance;
	private String name;
	private Date dob;
	
	public Account(int no, double balance, String name, Date dob) {
		super();
		this.no = no;
		this.balance = balance;
		this.name = name;
		this.dob = dob;
	}
	public Date getDob() {
		return this.dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getNo() {
		return this.no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [no=" + no + ", balance=" + balance + ", name=" + name + "]";
	}
	
}
