package com.practice.javaclass;

public class StringClass1 {

	public static void main(java.lang.String[] args) {

		final String s = new String(" A particular advantage of using interface in Java"
				+ " is that it allows multiple inheritance. The full power of Interface is"
				+ " utilized when dependency injection techniques is used to inject required "
				+ "implementation on run time ");

		String sub = new String("run");

		if (s.contains(sub)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}