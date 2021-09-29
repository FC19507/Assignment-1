package com.freecharge.BankXYZ;

import java.util.Date;

public class CurrentAccount extends BankDetails {
	   String accounttype;

	public CurrentAccount(String name,StringBuilder address,double balance,String status ,Date opendate) {
		super(name,address,balance,status,opendate);
		this.accounttype="Current";
	 }

	
	
}
