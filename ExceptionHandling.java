package com.practice.javaclass;

import java.util.Scanner;

public class ExceptionHandling {

	int x = 1;
	Scanner in = new Scanner(System.in);

	public double div() {
			try {

				System.out.println("Enter first number : ");
				double i = in.nextInt();
				System.out.println("Enter second number : ");
				double j = in.nextInt();
				double result = i / j;
				return result;

			} catch (Exception e) {
				System.out.println("Yo can't do that. Try Again!");
			}
			
	}

	public static void main(String args[]) {

		ExceptionHandling a = new ExceptionHandling();
		System.out.println("Result : " + a.div());
	}

}
