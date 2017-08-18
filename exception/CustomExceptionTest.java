package com.corejava.exception;

public class CustomExceptionTest {

	public static void main(String[] args) throws InsufficientBalanceException{
		Account a1=new Account();
		a1.setBalance(10000);
		
		a1.withdraw(20000000);
	}

}
