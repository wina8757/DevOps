package basicjavaprogram;

public class Customer {
	private int accountNum;
	private double balance;
	private String custName;
	private String email;
	private String phone;
	
	public Customer() {
		this.accountNum = 123456789;
		this.balance = 50.00;
		this.custName = "Jessen";
		this.email = "jewinardinata@csumb.edu";
		this.phone = "(323)317-0029";
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
		System.out.print("You made "); 
		System.out.printf("%.2f", amt);
		System.out.print(" $ deposit into your account and your account balance is $");
		System.out.printf("%.2f", balance);
		System.out.println("");
	}
	
	protected void withdrawal(double amt) {
		if(this.balance >= amt)
		{
			this.balance -= amt;
		}
		else {
			System.out.println("You have insufficient funds in your account. Please try again!");
		}
		System.out.print(custName +" withdraw ");
		System.out.printf("%.2f", amt);
		System.out.print(" $ from your account and your account balance is $");
		System.out.printf("%.2f", balance);
		System.out.println("");
	}
	
	protected void print() {
		System.out.println(accountNum + " " + custName + " " + balance + " " + email + " " + phone + "\n");
	}
	
	
	
}