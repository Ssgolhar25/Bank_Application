package BankApplication;

import java.util.Scanner;

public class Bank_Appln {
	 public static void main(String[] args) {
	        System.out.println("**MONEY BANK**");
	        BankAccount obj = new BankAccount(": Sandeep Golhar", ": SG00001" );
	        obj.showMenu();
	    }
	}
	class BankAccount {
	    int balance;
	    int previousTransaction;
	    String customerName;
	    String customerId;
	    BankAccount(String CName, String CId  ) {
	        customerName = CName;
	        customerId = CId;
	    }

	    void Deposit(int amount) {
	        if (amount != 0) {
	            balance = balance + amount;
	            previousTransaction = amount;
	        }
	    }

	    void Withdraw (int amount) {
	        if (amount != 0) {
	            balance = balance - amount;
	            previousTransaction = -amount;
	        }
	    }

	    void getPreviousTransaction() {
	        if(previousTransaction > 0) {
	            System.out.println("Deposited: " + previousTransaction);
	        }
	        else if (previousTransaction < 0) {
	            System.out.println("Withdraw: " +Math.abs(previousTransaction));
	        }

	        else {
	            System.out.println("No Transaction Occured");
	        }
	    }

	    void showMenu() {
	        char option = '\0';
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome " + customerName);
	        System.out.println("Your ID " + customerId);
	        System.out.println("\n");

	        System.out.println("A : Check Your Balance");
	        System.out.println("B : Deposit");
	        System.out.println("C : Withdraw");
	        System.out.println("D : Previous Transaction");
	        System.out.println("E : Exit");

	        do {
	            System.out.println("********************************************");
	            System.out.println("Enter Your Option");
	            System.out.println("********************************************");
	            option = scanner.next().charAt(0);
	            System.out.println("\n");

	            switch (option) {
	                case 'A':
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("Balance = " + balance);
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("\n");
	                    break;

	                case 'B':
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("Enter Amount To Deposit");
	                    System.out.println("------------------------------------------------------------");

	                    int amount = scanner.nextInt();
	                    Deposit (amount);
	                    System.out.println("\n");
	                    break;

	                case 'C':
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("Enter Amount To Withdraw");
	                    System.out.println("------------------------------------------------------------");

	                    int amount2 = scanner.nextInt();
	                    Deposit (amount2);
	                    System.out.println("\n");
	                    break;

	                case 'D':
	                    System.out.println("------------------------------------------------------------");
	                    getPreviousTransaction();
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("\n");
	                    break;

	                case 'E':
	                    System.out.println("===================================================================================================================================");
	                    break;

	                default:
	                    System.out.println("Invalid Option!! Please Enter Correct Option....");
	                    break;
	            }
	        }
	        while (option != 'E');
	        System.out.println("Thank You For Using Our Services......!!");
	        System.out.println("===================================================================================================================================");
	    }
	}



