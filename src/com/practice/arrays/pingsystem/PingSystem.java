package com.practice.arrays.pingsystem;

import java.util.Scanner;

public class PingSystem {

	public static void main(String[] args) {
		// TODO A range of IP addresses you should ping and validate 
		//String[] inAddresses = {};
		//ask a user to replace a ip address E.g. 192.168.0.1 to 192.168.10.01
		
		
		String[] ips = {"10.201.21.10","109.102.10.121","192.168.0.1"};
		
		for(int index = 0;index <ips.length;index ++) {
			
			System.out.println("ping ip : "+ ips[index]);
					}
		
		//System.out.println("Old ip is : "+ips[0]);
		//String replacement = ips[0];
	//	replacement.replaceAll("10.201.21.10", "192.10.10.10");
 		//.replaceAll("10.201.21.10", "192.10.10.10");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ip# to be replaced ");
		int iprep = input.nextInt();

//		x:
		System.out.println("Old ip is :"+ips[iprep-1]);
		ips[iprep-1] = "192.10.10.10";
		System.out.println("New ip is :"+ips[iprep-1]);
		

	}

}
