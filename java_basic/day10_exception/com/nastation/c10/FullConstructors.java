package com.nastation.c10;

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}

public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}

	public static void main(String[] args) {
		try {
			f();
//		} catch (NullPointerException e) {
//			
		} catch (MyException e) {
			e.printStackTrace(System.err);
		}
		
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.err);
		}
		
		System.out.println("End");
	}
} // /:~
