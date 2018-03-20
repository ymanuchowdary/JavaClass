package com.practice.javaclass;

public class StringClass {

	public static void main(java.lang.String[] args) {

		java.lang.String s1 = "Bitcoin is a cryptocurrency and worldwide payment system. "
				+ "It is the first decentralized digital currency, as the system works without a central bank or single administrator."
				+ " The network is peer-to-peer and transactions take place between users directly, without an intermediary.";
		java.lang.String s2 = "Manoj&Yenigalla";

		java.lang.String[] arrOfString = s2.split("&", 6);

		System.out.println("Length of String = " + s1.length());
		System.out.println("Lower Case = " + s1.toLowerCase());
		System.out.println("Upper Case = " + s1.toUpperCase());
		System.out.println("Index of = " + s1.indexOf("the"));
		System.out.println("Replace of =  " + s1.replace("Emily", "Michel"));
		System.out.println("Empty = " + s1.isEmpty());
		System.out.println("Subsequence = " + s1.subSequence(0, 30));
		System.out.println("Char at =" + s1.charAt(4));

		for (java.lang.String a : arrOfString)
			System.out.println(a);

	}

	private String[] split(java.lang.String string, int i) {

		return null;
	}

}