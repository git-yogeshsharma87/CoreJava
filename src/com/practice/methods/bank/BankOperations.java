package com.practice.methods.bank;

public class BankOperations {

	/*
	 * public static void main(String[] args) { Account account = new Account();
	 * 
	 * }
	 */

	public double showBalance(Account account) {
		System.out.println("The user : " + account.accNo + " has balance : "+ account.balance);
		return account.balance;
	}
	
	public double withdrawAmount(Account account, double amount) {
		if( amount > 0 || amount <account.balance) {
		account.balance -= amount;
		return account.balance;		
	}
		else {
			System.out.println("Invalid amount");
			return 0;
		}

			
	}
}
