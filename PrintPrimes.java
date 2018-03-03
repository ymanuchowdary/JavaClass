package com.practice.javaclass;

import com.practice.javaclass.CheckPrime;
public class PrintPrimes {

	public void printPrimeNumbers() {
		
		CheckPrime ch = new CheckPrime();
		
		for(int i = 3; i<=180; i++) {
			
			boolean status = ch.isPrime(i);
			
			System.out.println(i+"is "+ status);
			
		}
	}
	
	public static void main(String args[]) {
		
		PrintPrimes p= new PrintPrimes();
		p.printPrimeNumbers();
		
	}

}
