package com.practice.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountMap {


	public static void main(String[] args) {

		Account account1 = new Account(1001, "Ava green", 32424.24);
		Account account2 = new Account(1002, "Keet Kumar", 34.24);
		Account account3 = new Account(1003, "Emma Kim", 234.24);
		Account account4 = new Account(1004, "David Miller", 34545.24);
		Account account5 = new Account(1005, "Tony Stark", 345.24);
		
		Map<Long, Account> accountMap = new LinkedHashMap<Long, Account>();
		
		accountMap.put(700001L, account1);
		accountMap.put(700002L, account2);
		accountMap.put(700003L, account3);
		accountMap.put(700004L, account4);
		accountMap.put(700005L, account5);
		
		for(Map.Entry<Long, Account> entry : accountMap.entrySet()) {
			
			System.out.println("Account Number : "+ entry.getKey());
			System.out.println("Account details : "+ entry.getValue());
			System.out.println("-----------------------");
			
			System.out.println(accountMap.get(700001L));
		}

	}

}
