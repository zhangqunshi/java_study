package com.nastation.c10;

public class DivisionByZero3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		
		try {
		    System.out.println(b / a);
		} catch (ArithmeticException ae) {
	  		ae.printStackTrace();
	  }	
	  
	}
}
