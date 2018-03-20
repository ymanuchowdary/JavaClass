package com.practice.javaclass;

public class StaticInstanceVariables {

	int i = 10;
	static int j = 20;

	public static void staticmethod() {

		System.out.println("Static Method");
		System.out.println("Cannot call i(instance variable in static method) Static j value is " + j);

	}

	public void instancemethod() {

		System.out.println("Instance Method");
		System.out.println("Instance variable i = " + i + " Static j value is " + j);

	}

	public static void main(String args[]) {
		staticmethod();
		StaticInstanceVariables a1 = new StaticInstanceVariables();
		a1.instancemethod();

		StaticInstanceVariables m1 = new StaticInstanceVariables();
		StaticInstanceVariables m2 = new StaticInstanceVariables();

		System.out.println("The value of i in m1 = " + m1.i);
		System.out.println("The value of j in m1 = " + m1.j);

		m1.i = 30;
		m1.j = 30;

		System.out.println("The value of i in m2 = " + m2.i);
		System.out.println("The value of j in m2 = " + m2.j);

		staticmethod();
		a1.instancemethod();
	}
}
