package com.practice.accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {

		Hero hero = new Hero();
		System.out.println("The Power " + hero.power);
		hero.usePower();
		
		//public methods
		hero.showPower();
		
		
	}

}


class Hero {
	//protected properties 
	protected String power = "Wolverin - Healing Power";
	
	//protected methods 
	protected void usePower() {
		System.out.println("The Best power is "+ power);
	}
	
	public void showPower() {
		System.out.println("The power is "+ power);
	}
	protected Hero() {}
}