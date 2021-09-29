package com.freecharge.BankXYZ;

public class MainBank {

	public static void main(String[] args) {
		    BankDetails B1=new SavingAccount();
		       BankDetails B2=new CurrentAccount();
		       B1.withdraw();
		       B2.withdraw();
		       B1.deposite();
		       B2.deposite();
		    

	}

}
