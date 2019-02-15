package collection;

import java.util.*;

public class BankAccountList {
public static void main(String[] args) {
	SavingAccount savingacc=new SavingAccount(1000,123,"swati",true);
	SavingAccount savingacc1=new SavingAccount(5000,423,"priti",false);
	SavingAccount savingacc2=new SavingAccount(1000,123,"swati",true);
	SavingAccount savingacc3=new SavingAccount(2000,813,"chaitali",true);
	TreeSet<SavingAccount>hash_set=new TreeSet<SavingAccount>();
	hash_set.add(savingacc);
	hash_set.add(savingacc1);
	hash_set.add(savingacc2);
	hash_set.add(savingacc3);
	for(SavingAccount s1: hash_set)
	{
	System.out.println(s1); 
	}
}
}
