package com.corejava.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private double balance;
	ReentrantLock lock=new ReentrantLock(); 

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@SuppressWarnings("finally")
	public double withdraw(double amount) 
	{
		lock.lock();
		try
		{
			balance-=amount;
			return balance;
		}
		finally
		{
			lock.unlock();
			return balance;
		}
	}	
	public double deposit(double amount) 
	{
		
		balance+=amount;
		return balance;
	}

}

