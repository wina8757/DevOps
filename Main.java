package basicjavaprogram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Customer a = new Customer (1231231, 1000, "Johny Sin" , "john@gmail.com", "(831)231-5461");
		
		Boolean flag = true;
		
		Scanner s = new Scanner(System.in);
		
		while(flag) {
			
			System.out.print("Options 1 for Show Account Balance, "
					+ "2 for Deposit Money, 3 for Withdraw Money, 4 for Exit the Progam: ");
			
			int num = s.nextInt();
			
			System.out.println("");
			
			switch(num){
				case 1:	
					System.out.print("Your account balance is $ ");
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
					flag = false;
					System.out.println("You've successfully exit the program; Thank's for using our system!");
					break;
			}
		
		}
			
	}

}

// Give user options to Show Account Balance, Deposit Money, Withdraw Money and Exit out of program
// Add some System.out.println's in all methods above as well.