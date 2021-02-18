package com.gitdemo.tests;

public class MethodWithReturnTypes {
	

	public static void main(String[] args) {		
		MethodWithReturnTypes g =new MethodWithReturnTypes();
		int sum = g.sum(68, 45);
		System.out.println(sum);
		
		double d = g.sub(89, 98.78);
		System.out.println(d);
		
		String s=MethodWithReturnTypes.alphanumeric("bala", 45);
		System.out.println(s);
		
}
	
	public int sum(int x , int y) {		
		int z = x+y;
		return z;
	}
	public double sub(int a , double b) {		
		double c = a-b;
		return c;
	}
	public static String alphanumeric(String name , int b) {		
		String s = name+b;
		return s;
	}
	
}
