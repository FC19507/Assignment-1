package com.freecharge.BankXYZ;

import java.util.Scanner;

abstract class BankDetails {
	String name;
	String addres;
	double balance;
	String status;
	public BankDetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name,address (city ,state,pin) ,balancen , status( ACTIVE or INACTIVE or CLOSED)");
		this.name=scanner.nextLine();
		//scanner.nextLine();
		this.addres=scanner.nextLine();
		//scanner.nextLine();
		this.balance=scanner.nextDouble();
		this.status=scanner.nextLine();
	}
	public void withdraw() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Amount that you want to withdraw ");
		double amount=scanner.nextDouble();
		if(this.status=="ACTIVE") {
		if(amount>this.balance) {
			System.out.println("Balance less then withdraw amount ");
		}
		else {
			this.balance=this.balance-amount;
			System.out.println("Withdraw amount "+ amount+" succefully done");
		}
	}
		else
			System.out.println("Account INACTIVE OR CLOSED");
	}
	public void deposite() {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter amount that you want to deposite ");
		double amount=scr.nextDouble();
		if(this.status=="ACTIVE") {
		this.balance+=amount;
		System.out.println("Successfully Deposite");
	}
	else
		System.out.println("Account INACTIVE OR CLOSED");
	}	

}
