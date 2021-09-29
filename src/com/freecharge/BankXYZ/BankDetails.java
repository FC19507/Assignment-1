package com.freecharge.BankXYZ;

import java.util.Date;
import java.util.Scanner;

abstract class BankDetails {
	private String name;
	private StringBuilder address;
	private double balance;
	private String status;
	private Date createdDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StringBuilder getAddres() {
		return address;
	}
	public void setAddres(StringBuilder addres) {
		this.address = addres;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public BankDetails(String name,StringBuilder address,double balance,String status ,Date opendate) {
		this.name=name;
		this.address=address;
		this.balance=balance;
		this.status=status;
		this.createdDate=opendate;
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
	public void showBalance() {
		System.out.println("You account balance :"+this.balance);
	}
	 }

		
