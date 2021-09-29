package com.freecharge.BankXYZ;

import java.util.Date;

public class SavingAccount extends BankDetails{
	   String accounttype;

		public SavingAccount(String name,StringBuilder address,double balance,String status,Date opendate) {
			super(name,address,balance,status,opendate);
			this.accounttype="Saving";
		 }	
		 
	 }
