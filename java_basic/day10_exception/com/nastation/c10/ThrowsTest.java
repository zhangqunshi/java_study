package com.nastation.c10;

class MyException extends Exception {
	MyException() { super(); };
	MyException(String s) { super(s); };
}

class ThrowsTest
{
	void f() throws MyException {
      if (fff) {
		  throw new MyException("hello");
      } else {
	  	  throw new CCCExceptin("fjdlsf");
      }
      //System.out.println("sss");
	}
	
	
	public static void main(String[] args) {
		
		try {
			new ThrowsTest().f();
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}