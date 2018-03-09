package com.practice.javaclass;
import java.util.Scanner;

public class Fibonacci {
	
	public static void PrintFibonacci()
	{
		long n1 = 1;
		long n2 = 1;
		long n3; 
		long n4;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		n4 = sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i = 1; i<=n4; i++)
		{
			n3 = n1 + n2;
			if(n3<=n4)
			{
				n1 = n2;
				n2 = n3;
			}
			else break;
			System.out.print(" " + n3);
		}
	}
	public static void main(String args[])
	{
		Fibonacci p = new Fibonacci();
		Fibonacci.PrintFibonacci();
	}
}
