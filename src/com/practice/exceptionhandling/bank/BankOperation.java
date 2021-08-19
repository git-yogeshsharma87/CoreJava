package com.practice.exceptionhandling.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

public class BankOperation {

	public static void main(String[] args) {

		//account list 
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(100001, "Tony Stark",9898983));
		accounts.add(new Account(100002, "Eva Smith",9898983));
		accounts.add(new Account(100003, "Mark Zen",9898983));
		accounts.add(new Account(100004, "Amith Sha",9898983));
		accounts.add(new Account(100005, "Azhar Farooq",9898983));
		accounts.add(new Account(100006, "Mike Stark",9898983));
	
		showBalance(100003,accounts);
		showBalance(100007,accounts);

		System.out.println("---------------------------");
		try {
			depositAmount(100003, accounts, 100);
		} catch (InvalidTxException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			depositAmount(100003, accounts, 0);
		} catch (InvalidTxException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
	
	// show balance 
	
	private static Account showBalance(int accNo,List<Account> accounts) {
		
		try {
			int count = 0;
			for(Account acc: accounts ) {
				if(acc.accNo == accNo) {
					System.out.println("Account is found and is : "+acc.accNo + " for user : "+acc.name+"  has balance"+acc.balance);
				count++;
				return acc;
				}
			}
			if (count==0) {
				throw new AccountNotFoundException("Account does not exist with accNo. : "+accNo);
			}
		}catch(AccountNotFoundException e) {
			System.out.println(e);
			
		}
		return null;
	}
	
	//deposit
	private static void depositAmount(int accNo,List<Account> accounts, int depositAmount) throws InvalidTxException {
		Account fetchedAccount = showBalance(accNo,accounts);
		if(fetchedAccount != null && depositAmount > 0) {
		
				fetchedAccount.balance += depositAmount;
		
		}
		else {
			throw new InvalidTxException("InvalidDepositAmount ");
		}
		
		
	}
	
	
	//withdraw
	//calculate on balance 

}
