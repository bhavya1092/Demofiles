package p2;

public class Account 
{
	

	
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
	    this.balance=balance;			
	}
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("After withdraw" + amount +"The balance is :" + balance);
	}

	public void deposit(int amount)
	{ 
		
		balance=balance+amount;
		System.out.println("After deposit" +  amount  +"The balance is :" +balance);
	}
	public static void main(String[] args) 
	{
    Account a1=new Account(12,16);
    a1.withdraw( 30);
    a1.deposit(50);
    



	}

}
