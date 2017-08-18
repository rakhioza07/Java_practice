package com.corejava.exception;

public class Account {

	private double balance;
	
	public Account() {
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws InsufficientBalanceException
	{
		if(balance<amount)
			throw new InsufficientBalanceException("Please refil your account!");
		else 
			balance-=amount;
		
		return balance;
	}

}
