package com.gitdemo.tests;

public class Methods {
	

	public static void main(String[] args) {		
		Methods g =new Methods();
		g.sum(67, 87);	
		g.getNames("bala", "siva");
		g.alphaNumeric("raju", 788);
}
	
	public void sum(int x , int y) {		
		int z = x+y;
		System.out.println(z);
	}
	public void getNames(String firstname  , String lastname) {		
		
		System.out.println(firstname+ " " +lastname);
	}
	public void alphaNumeric(String name  , int number) {		
		
		System.out.println(name+number);
	}
	
}
