package application;

import java.util.Scanner;

import entities.Account;

public class ProgamAccount {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    Account ac;
    
    System.out.print("Enter account number: ");
    int acnumber = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String acholder = sc.nextLine();

    System.out.print("is there an initial deposit (y/n)? ");
    char resp = sc.next().charAt(0);
    System.out.println();
    
    if (resp == 'y') {
    	
    	System.out.print("Enter initial deposit value: ");
    	double deposit = sc.nextDouble();
    	ac = new Account(acholder,acnumber,deposit);
    	
    }
    else {
    	ac = new Account(acholder,acnumber);
    }
    
    System.out.println("Account data: " + ac);
    
    System.out.print("Enter a deposit value: ");
    double deposit = sc.nextDouble();
    ac.deposit(deposit);
    
    System.out.println("Updated data: " + ac);
    
    System.out.print("Enter a witdraw value: ");
    double wit = sc.nextDouble();
    ac.witdraw(wit);
    
    System.out.println("Updated data: " + ac);
 
    

    sc.close();

    }



  }