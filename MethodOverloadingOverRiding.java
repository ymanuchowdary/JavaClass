package com.practice.javaclass;

public class MethodOverloadingOverRiding extends ConstructorOverloading {
	
	public void methodoverloading()
	{
		System.out.println("Calculated when no arguments are passed = Null");
	}

	public void methodoverloading(int i)
	{
		System.out.println("Calculated when 1 argument is passed of type int " +i);
	}
	
	public void methodoverloading(int i , int j) {
		int z = i + j;
		System.out.println("Calculated when 2 argument are passed of type int = " + z);
	}
	
	public void methodoverloading(int i , int j , int k)
	{
		int z = i + j + k;
		System.out.println("Calculated when 3 arguments are passed of type int = " + z);
	}

	public static void main(String args[]) {
		
		MethodOverloadingOverRiding a1 = new MethodOverloadingOverRiding();
		a1.methodoverloading();
		a1.methodoverloading(10);
		a1.methodoverloading(10,20);
		a1.methodoverloading(10,20,30);
		ConstructorOverloading a2 = new ConstructorOverloading(10 , " Hi");
	}
}
