package com.practice.javaclass;

public class CheckPrime {
	public boolean isPrime(int x) {
		for(int y=2; y<x; y++) {
			if(x%y==0) {
				return false;
			}
		}
		return true;
}
}
