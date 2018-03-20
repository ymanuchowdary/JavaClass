package com.practice.javaclass;

public class InterfaceKane implements InterfaceWrestler {
	
	public void themeMusic() {
		System.out.println("StoneCold Intro Music");
	}
	
	public void finisher() {
		System.out.println("Stone Cold Stunner");
	}
	
	public void paymentForWork(int hours) {
		System.out.println("The Wrestler will make $" + hours*500 + " for tonight's match");
	}

}