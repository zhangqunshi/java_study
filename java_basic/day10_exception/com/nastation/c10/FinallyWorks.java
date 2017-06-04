package com.nastation.c10;

//: c10:FinallyWorks.java
//The finally clause is always executed.
class ThreeException extends Exception {
}

public class FinallyWorks {
	
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				// Post-increment is zero first time:
				if (count++ == 0) {
					System.out.println("count: " + count);
					throw new ThreeException();
				}
				System.out.println("No exception");
			} catch (ThreeException e) {
				System.err.println("ThreeException");
			} finally {
				System.err.println("In finally clause");
				if (count == 2)
					break; // out of "while"
			}
		}
	}
}