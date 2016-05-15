package com.bogotobogo;

public class BankAccount {

	  private double balance;

	  public BankAccount(double balance) {
	    this.balance = balance;
	  }

	  public double debit(double amount) {
	    if (balance < amount) {
              
	      mount = balance;
	    }

	    balance -= amount;
	    return amount;
	  }

}
