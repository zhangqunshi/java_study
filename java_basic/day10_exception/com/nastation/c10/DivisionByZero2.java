package com.nastation.c10;

public class DivisionByZero2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		
		int c = 0;
		boolean flag = false;
		
		while (!flag) {
		  try {
		    c = b / a;
		    flag = true;
	  	} catch (ArithmeticException ae) {
	  		System.out.println(ae.getMessage());
	  		ae.printStackTrace();
	     	a = 1;
			  System.out.println("Error: 除法中的分母为0.");
		  }
	  }
	  System.out.println("c=" + c);
		
	}

}
