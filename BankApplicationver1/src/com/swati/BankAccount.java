package com.swati;
//package is a collection of classes.
public class BankAccount {
	//static variables 
	//static variables are loaded before class is being loaded
	private static int autoAccountNo;
	
	//instance variable / class variable
 private static int accountNo;
 private String accountHolderName;
 protected double accountBalance; 
 // we cannot access instance variable if objects are not exist
 
 //init block:is used to remove redundancy
 //init block is well executed before constuctor is called.
 {
	 accountNo=++autoAccountNo;
	 
 }

 //default constructor
 public BankAccount() {
	 //use of constructor is to initialize instance variable
	 //constructor is called automatically when object is created
	 	accountHolderName="unknow";
	 	accountBalance=4000;
 }
 
 //parameterized constructor
 public BankAccount(String accountHolderName, double accountBalance) {
	 //setter method= modify/or reinitialized member variable 
	 this.accountHolderName=accountHolderName;
	 this.accountBalance=0;
	 	
 }
 public void setAccountHolderName(String accountHolderName) {
	 {
	 	this.accountHolderName=accountHolderName;
	 }
 }
public String getAccountHolderName() {
	return accountHolderName;
}
	 
 public static int getAutoAccountNo() {
	return autoAccountNo;
}

public static void setAutoAccountNo(int autoAccountNo) {
	BankAccount.autoAccountNo = autoAccountNo;
}

//getter method:it provides read only access to user
public static int getAccountNo() {
	return accountNo;
}

public static void setAccountNo(int accountNo) {
	BankAccount.accountNo = accountNo;
}

public double getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}

//setter method
public void withdraw(double amount)
{
	this.accountBalance-=amount;
	
}

public void deposit(double amount)
{
	this.accountBalance+=amount;
}
public static void main(String args[]) 
 {
	BankAccount acc= new BankAccount();
	BankAccount acc2= new BankAccount("onkar",5000);
	
}

 }
