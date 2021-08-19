package com.practice.accessmodifiers.bank;

public class BankLocker {

	public static void main(String[] args) {
		Account account = new Account();
		account.email = "johnavera@gmail.com";
		account.gender= " Male";
		System.out.println("The Locker Bank : " + account.bankName);
		System.out.println("The Locker type : " + account.accType);
		System.out.println("email is : "+ account.email);
		System.out.println("Gender is : "+ account.gender);
		account.showAccount();
	}

}

class Account { 
	
	public String bankName = "Iron Bank";
	private long accNo = 234343;
	private int accPin = 2393;
	protected String accType = "current";
	String email;
	String gender;
	
	
	public void showAccount() {
		System.out.println("Account number : "+accNo+"Account pin : "+ accPin);
	}
}
