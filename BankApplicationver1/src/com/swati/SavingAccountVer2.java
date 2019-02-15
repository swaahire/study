package com.swati;

public class SavingAccountVer2 extends SavingAccount implements Insurance{

	public SavingAccountVer2(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getinsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


