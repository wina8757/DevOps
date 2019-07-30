// Jessen Winardinata

package basicjavaprogram;

import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
		

		// exercise
//		int a = 500;
//		short b = 10;
//		byte c = 30;
//		long d = 70000 + (15*a) + b + c;
//		System.out.print(d);
		
		// exercise pounds to kg
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Pounds value: ");
//		double lb = s.nextDouble();
//		
//		System.out.println("Pounds to Kg: ");
//		double poundstokg = lb * 0.45359237;
//		System.out.print(poundstokg + " Kg");
				
		// If-Else practice
		
//		Scanner val = new Scanner(System.in);
//		System.out.print("Enter a number between 1 to 4: ");
//		int value = val.nextInt();
//		
//		if(value==1)
//			System.out.println("Value is equal to 1");
//		else if(value==2)
//			System.out.println("Value is equal to 2");
//		else if(value==3)
//			System.out.println("Value is equal to 3");
//		else if(value==4)
//			System.out.println("Value is equal to 4");
//		else
//			System.out.println("Value is not set, please try again!");
		
		Scanner s = new Scanner(System.in);
	
		boolean flag = true;
		
		while(flag) {
			   System.out.print("Enter a character from a to e (Uppercase and Lowercase accepted): ");
			   
			   String word = s.next();
			   
			   switch(word.toLowerCase()){ 
	            case "a": 
	                System.out.println("apple"); 
	                break; 
	            case "b": 
	                System.out.println("two"); 
	                break; 
	            case "c": 
	                System.out.println("three"); 
	                break;
	            case "d":    
	            	System.out.println("four");
	            	break;
	            case "n":
	            	flag=false;
	            	break;
	            default: 
	                System.out.println("no match"); 
	        } 
			   
		}
		
		System.out.print("You're out from the program");
		
	}


}
