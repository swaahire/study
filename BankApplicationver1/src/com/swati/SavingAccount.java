package com.swati;

public class SavingAccount extends BankAccount {
	private boolean isSalaryAccount;
public SavingAccount(String accountHolderName, double accountBalance)
{
	super(accountHolderName,accountBalance);
	
}
public void withdraw(double amount)
{
	this.accountBalance-=amount;
	
}
public boolean isSalaryAccount()
{
	return isSalaryAccount;
}
}
