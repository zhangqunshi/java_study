package com.nastation.c10;

//: c10:RethrowNew.java
//Rethrow a different object
//from the one that was caught.

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class RethrowNew {
	
	public static void f() throws OneException {
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public static void main(String[] args) throws TwoException {
		try {
			f();
		} catch (OneException e) {
			System.err.println("Caught in main, e.printStackTrace()");
			e.printStackTrace(System.err);
			throw new TwoException("from main()");
		}
	}
}