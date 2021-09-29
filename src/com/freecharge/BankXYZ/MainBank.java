package com.freecharge.BankXYZ;

import java.util.Date;
import java.util.Scanner;

public class MainBank {
	
public static BankDetails openAccount() {
		
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your details to open an account");
		
		System.out.println("Enter your name");
		String ownerName = scnr.nextLine();
		
		System.out.println("Enter your city");
		String city = scnr.next();

		System.out.println("Enter your State");
		String state = scnr.next();

		System.out.println("Enter your pincode");
		String pincode = scnr.next();
		
		StringBuilder address = new StringBuilder(city);
		address.append(" , ");
		address.append(state);
		address.append(" , ");
		address.append(pincode);
		
		System.out.println("1. Saving Account \n 2. Current Account");
		int choice = scnr.nextInt();
		BankDetails newAccount;
		
		if(choice==1) {
			newAccount = new SavingAccount(ownerName,address,0.0,"ACTIVE",new Date());
		}else if (choice == 2) {
			newAccount = new CurrentAccount(ownerName,address,0.0,"ACTIVE",new Date());
		}else {
			System.out.println("Wrong Input");
			return openAccount();
		}
		return newAccount;
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");
		BankDetails newAccount = openAccount();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Your Account is Succesfully Opened");
		
		char choice;
		do {
			System.out.println("Enter Choice");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			choice = scnr.next().charAt(0);
			switch(choice) {
				case '1':
					newAccount.deposite();
					break;
				case '2':
					newAccount.withdraw();
					break;
				
				case '3':
					newAccount.showBalance();
					break;
					
				case '4':
					System.exit(0);
					break;
					
				default:
					System.out.println("Wrong Choice");
					break;
			}
			
		} while(choice!='4');
		
		
	}
	
	

}

