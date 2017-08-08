class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id,String name,double balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
}
class SavingAccount extends Account{	

	private double fixedDeposit;
	
	public SavingAccount(int id,String name,double balance,double fixedDeposit)
	{
		super(id,name,balance);
		this.fixedDeposit=fixedDeposit;
	}	
	
	public double getBalance()
	{
		return super.getBalance() + this.fixedDeposit;
	}	
}
class CurrentAccount extends Account{
	
	private double cashCredit;
	
	public CurrentAccount(int id,String name,double balance,double cashCredit)
	{
		super(id,name,balance);
		this.cashCredit=cashCredit;
	}	
	
	public double getBalance()
	{
		return super.getBalance() + this.cashCredit;
	}
}
public class AccountTestPoly{
	public static double getTotalCashInBank(Account []acc)
	{
		double cash=0.0;
		
		for(Account a:acc)
		{
			cash+=a.getBalance();
		}
		
		return cash;
	}
	public static void main(String []args){
		
		Account []e=new Account[3];
		e[0]=new SavingAccount(101,"Edward",30000,5000);
		e[1]=new SavingAccount(102,"James",25000,10000);
		e[2]=new CurrentAccount(201,"Rheagar",50000,20000);
		
		System.out.println("Total salary is : "+ getTotalCashInBank(e));
	}
}