package com.swati;

public class CurrentAccount extends BankAccount{
	
	
		double odLimit = 20000;
	
	
	public void withdraw(double amount)
	{
		{
			
			if(this.accountBalance-amount>0)
			{
				System.out.println(this.accountBalance);
			}
			else if(amount>this.accountBalance)
			{
				odLimit=amount-this.accountBalance;
				this.accountBalance=this.accountBalance-amount;
				System.out.println("odLimit and AccountBalance"+odLimit+this.accountBalance);	
			}
			else
			{
				
			}
		}
		
	}


	
	
}
