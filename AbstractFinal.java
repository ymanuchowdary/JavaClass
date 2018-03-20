package com.practice.javaclass;



public class AbstractFinal {

	public static void main(String args[]) {
		
		AbstractWrestler wrestler1 = new AbstractKane();
		AbstractWrestler wrestler2 = new AbstractStoneCold();
		
		wrestler1.themeMusic();
		wrestler1.finisher();
		wrestler1.paymentForWork(5);
		
		wrestler2.themeMusic();
		wrestler2.finisher();
		wrestler2.paymentForWork(3);
	}
}
