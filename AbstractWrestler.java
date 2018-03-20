package com.practice.javaclass;

public abstract class AbstractWrestler {
	public void paymentForWork(int hours) {
		System.out.println("The Wrestler will make $" + hours*250 + "for tonight's match");
	}
	
	public abstract void themeMusic();
	public abstract void finisher();

}
