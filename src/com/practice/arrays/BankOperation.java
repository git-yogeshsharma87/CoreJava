package com.practice.arrays;

import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {

		String[] usernames = {"Wahid", "Yogesh", "Sam", "Azhar", "Arti"};
		int[] userIds = {1001, 1002, 1003, 1004,1005};
		double[] balances = {76552.3,23423.456, 54654.67, 343.34, 8345.456};
		
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a userId");
//	x:
	int userId = input.nextInt();
	
	//find a userId
	int match = 0;
	for (int index=0;index < userIds.length;index++) {
		
		if (userIds[index]==userId) {
			
			System.out.println("User is found");
			System.out.println("Corresponding username is : "+usernames[index]+
					"and balance is : "+balances[index]);
			match++;
		}
		if (match !=0) {
			System.out.println("UserId is not found, Try again");
			//goto x: ;
	//	break;
		}
	}
		
		
		
		
		
	}

}
