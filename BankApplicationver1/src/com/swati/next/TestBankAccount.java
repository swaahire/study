package com.swati.next;
import com.swati.BankAccount;
import com.swati.CurrentAccount;
import com.swati.CurrentAccountVer2;
import com.swati.SavingAccount;
import com.swati.SavingAccountVer2;
public class TestBankAccount {
 public static void testBankAccountMethod()
 {
	 BankAccount acc=new BankAccount();
	 acc.setAccountHolderName("sachin");
	 }
 public static void testSavingAccount(){
	 SavingAccount savingAcc= new SavingAccount("swati",5000);
	 System.out.println("Account no is"+savingAcc.getAccountNo());
	 System.out.println("Account name is"+savingAcc.getAccountHolderName());
	 System.out.println("Account balance is"+savingAcc.getAccountBalance());
	 savingAcc.deposit(5000);
	 System.out.println("Account balance is"+savingAcc.getAccountBalance());
	 System.out.println("---------");
	 savingAcc.withdraw(3000);
	 System.out.println("Account balance is"+savingAcc.getAccountBalance());
	}
 
 /*public static void testCurrentAccount(){
	 CurrentAccount currentAcc= new CurrentAccount("swati",40000);
	 System.out.println("Account no is"+currentAcc.getAccountNo());
	System.out.println("Account name is"+currentAcc.getAccountHolderName());
	 System.out.println("Account balance is"+currentAcc.getAccountBalance());
	 currentAcc.deposit(5000);
	 System.out.println("Account balance is"+currentAcc.getAccountBalance());
	 System.out.println("---------");
	 currentAcc.withdraw(50000);
	 System.out.println("Account balance is"+currentAcc.getAccountBalance());
 }*/
 
 public static BankAccount getBankAccount(String accountType)
 { BankAccount acc=null;
 if(accountType.equals("Saving"))
 {
	 acc=new SavingAccount("Swati",4000);
 }
 else if(accountType.equals("Current")){
	 acc=new CurrentAccount();
 }
 else{
	 acc=null;
 }
 return acc;
 }
 public static void main(String[] args) {
	 SavingAccountVer2 acc= new SavingAccountVer2("swati",0);
	 acc.withdraw(400);
	 acc.deposit(4000);
	 acc.isSalaryAccount();
	 acc.getInsuranceName();
	 int getAccountBalance = 4000;
	System.out.println("account balance"+getAccountBalance);
	 CurrentAccountVer2 acc1=new CurrentAccountVer2();
	 acc1.withdraw(400);
	 acc1.deposit(4000);
	 acc1.getCurrInsuranceName();
	 String getCurrInsuranceName ="swati";
	System.out.println("Insurance Name:"+getCurrInsuranceName);
}
}
