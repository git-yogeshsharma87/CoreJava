package com.practice.methods.bank;

public class Test {

	public static void main(String[] args) {
		
		BankOperations operations = new BankOperations();
		Account account = new Account(100001,50000, "John Smith", "Iron Bank");
		operations.showBalance(account);
       double remBalance = operations.withdrawAmount(account, 3000);
       System.out.println(" The remaining balance is : "+ remBalance);
	}

}
