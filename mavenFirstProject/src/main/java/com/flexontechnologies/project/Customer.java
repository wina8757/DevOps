package com.flexontechnologies.project;

public class Customer {
	private int accountNum;
	private double balance;
	private String custName;
	private String email;
	private String phone;
	private double dailyLimit;
	
	public Customer() {
		this.accountNum = 123456789;
		this.balance = 800.00;
		this.custName = "John Hopkins";
		this.email = "johnhopkins@gmail.com";
		this.phone = "(323)387-0859";
	}
	
	public Customer(int accountNum, double balance, String custName, String email, String phone) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustName() {
		return custName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	protected void deposit(double amt) {
		this.balance += amt;
		System.out.print("\n$"); 
		System.out.printf("%.2f", amt);
		System.out.print(" deposit into your account and your account balance is $");
		System.out.printf("%.2f", balance);
		System.out.println("");
	}
	
	protected void withdrawal(double amt) {
		if(amt > balance){
			System.out.println("\nYou have insufficient funds in your account. Please try again!");
		}
		else if(dailyLimit >= 100) {
			System.out.println("\nYou have reached your daily withdrawal limit which is $100.00");
		}
		else if(amt > 1000) {
			System.out.println("\nYou only can withdraw money and or under $1000 per transaction. Please try again!");
		}
		else{
			this.balance -= amt;
			this.dailyLimit += amt;
			
			System.out.print("\n$");
			System.out.printf("%.2f", amt);
			System.out.print(" withdrawn from your account and your account balance is $");
			System.out.printf("%.2f", balance);
			System.out.println("");
		}
	}
	
	protected void print() {
		System.out.println("Customer Name: " + custName + "\nAccount Number: " + accountNum);
		System.out.print("Account Balance: $");
		System.out.printf("%.2f", balance);
		System.out.println("\nCustomer's Email: " + email + "\nCustomer's Phone Number: " + phone + "\n");
	}
	
	
	
}