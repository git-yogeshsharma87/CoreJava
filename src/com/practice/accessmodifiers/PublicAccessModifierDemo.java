package com.practice.accessmodifiers;

public class PublicAccessModifierDemo {
	
	public static void main(String [] args) {
		//create object
		Father father = new Father();
		System.out.println("Amount : " + father.amount);
		System.out.println("Park Name : " + father.park);
		System.out.println("------------------");
		//access methods
		System.out.println("Amount call by method : "+father.showAmount());
		System.out.println("Amount call by method : "+father.displayPark());
	}
	

}


class Father {
	//public variables 
public double amount = 87734.23d;
public String park = "Public Park";

//public methods
public double showAmount() {
	return amount;
}

public String displayPark() {
	
return park;
}
//constructor
public Father() {}
}