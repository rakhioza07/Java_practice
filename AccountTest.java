class Account{
	private int accountNo;
	private String accountType;
	private double balance;
	
	public Account(int accountNo,String accountType,double balance )
	{
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	public double getBalance()
	{
			return this.balance;
	}	
	
	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	
	public void withDraw(double amount)
	{
		this.balance-=amount;
	}
	public String toString()
	{
		return this.accountNo + " : " + this.accountType + " : " + this.balance;
	}
	
	
}

public class AccountTest
{
	public static void main(String []args)
	{
		Account a1=new Account(101, "Saving" , 10000);
		System.out.println(a1);
		
		a1.deposit(20000);
		System.out.println(a1.getBalance());

		a1.withDraw(5000);
		System.out.println(a1.getBalance());
	}
}