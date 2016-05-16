package com.bogotobogo;

public class BankAccount {

	  private double balance;

	  public BankAccount(double balance) {
	    this.balance = balance;
	  }

	  public double debit(double amount) {
	    if (balance < amount) {
              //test line 
	      amount = balance;
	    }

	    balance -= amount;
	    return amount;
	  }

}
