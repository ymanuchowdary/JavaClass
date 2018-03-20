package com.practice.javaclass;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("Printed when no arguments are passed");
	}

	ConstructorOverloading(int i)
	{
		System.out.println("Printed when 1 argument is passed of type int " +i);
	}
	
	ConstructorOverloading(int i , int j)
	{
		System.out.println("Printed when 2 argument are passed of type int and int " +i +" " +j);
	}
	
	ConstructorOverloading(int i , String s)
	{
		System.out.println("Printed when 2 arguments are passed of type int and string " +i +s );
	}

	public static void main(String args[])
	{
		ConstructorOverloading a1 = new ConstructorOverloading();
		ConstructorOverloading a2 = new ConstructorOverloading(10);
		ConstructorOverloading a3 = new ConstructorOverloading(10 , " Hi");
		ConstructorOverloading a4 = new ConstructorOverloading(10 , 20);
		
	}
}