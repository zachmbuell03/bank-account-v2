package bankaccount2;

import java.util.Scanner;

public class bankaccount2 {
	
	   String firstname;
	    String lastname;
	    int accountID;
	    double balance;

	    public bankaccount2(String firstname, String lastname, int accountID, double balance) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.accountID = accountID;
	        this.balance = balance;
	    }

	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String firstname = scnr.next();

	        System.out.print("Enter last name: ");
	        String lastname = scnr.next();

	        System.out.print("Enter account ID: ");
	        int accountID = scnr.nextInt();

	        System.out.print("Enter balance: ");
	        double balance = scnr.nextDouble();

	        bankaccount2 acct = new bankaccount2(firstname, lastname, accountID, balance);

	        if (acct.balance > 0) {
	            System.out.println(acct.firstname + " " + acct.lastname + ": $" + acct.balance);
	            System.out.println(acct.accountID);
	        } else {
	            acct.balance -= 30;
	            System.out.println("Overdraft fee: $" + acct.balance);
	            System.out.println(acct.firstname + " " + acct.lastname + ": $" + acct.balance);
	            System.out.println(acct.accountID);
	        }

	        scnr.close();
	    }
	}
