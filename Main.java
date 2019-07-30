package basicjavaprogram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Customer a = new Customer (625417358, 1000.00, "Jessen Winardinata", "jewinardinata@csumb.edu", "(831)231-5461");
//		Customer b = new Customer();
//		b.print();
		
		Boolean flag = true;
		
		Scanner s = new Scanner(System.in);
		
		while(flag) {
			System.out.println("----------------------Welcome to Rabo Bank----------------------\n");
			
			System.out.print("Transaction menu: \n\n" + "1 - View Account Balance\n" + "2 - Deposit cash\n"
					+ "3 - Withdraw cash\n" + "4 - View Account Details\n" + "5 - Exit Program\n\nPlease enter your choice: ");
			
			
			int num = s.nextInt();
			
			System.out.println("");
			
			switch(num){
				case 1:	
					System.out.print("Your account balance is $");
					System.out.printf("%.2f", a.getBalance());
					System.out.println("\n");
					break;
				case 2:
					System.out.print("Enter the amount that you want to deposit: $ ");
					double depositAmt = s.nextDouble();
					a.deposit(depositAmt);
					System.out.println("");
					break;
				case 3:
					System.out.print("Enter the amount that you want to withdraw: $ ");
					double withdrawAmt = s.nextDouble();
					a.withdrawal(withdrawAmt);
					System.out.println("");
					break;
				case 4:
					a.print();
					break;
				case 5:
					flag = false;
					System.out.println("You've successfully exit the program and Thank you for using our bank system!");
					break;
				default:
					System.out.println("You've entered the wrong choice. Please enter your choice again!\n");
			}
		
		}
			
	}

}

// Give user options to Show Account Balance, Deposit Money, Withdraw Money and Exit out of program
// Add some System.out.println's in all methods above as well.