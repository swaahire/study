package collection;

public class SavingAccount implements Comparable<SavingAccount>{
	int acc_balance,acc_ID;
	String accountHoldername;
	boolean isSalaryAccount;
	
	public SavingAccount(int acc_balance, int acc_ID, String accountHoldername,
			boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID="
				+ acc_ID + ", accountHoldername=" + accountHoldername
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public int compareTo(SavingAccount saving) {
		if(acc_balance>saving.acc_balance)
		{
			return 1;
		}
		else if(acc_balance<saving.acc_balance){
		return -1;
		}
		else
			return 0;
	}
	
}
