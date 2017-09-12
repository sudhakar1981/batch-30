package com.Test1;

public class Program1_NumbersExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 77;
		int b = 66;
		System.out.println("Before Swap-");
		System.out.println ("a Value is: "+a);
		System.out.println ("b Value is: "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap-");
		System.out.println ("a Value is: "+a);
		System.out.println ("b Value is: "+b);
		
		System.out.println(sayHello("Ganesh"));
		
	}
	
	public static String sayHello(String name){
		return "Hello " + name;
	}

}
