package com.nastation.c10;

//: c10:AlwaysFinally.java
//Finally is always executed.
public class AlwaysFinally2 {
	public static void main(String[] args) {
		int i = 0;
		label2:
		// System.out.println("hello");
		while (i < 5) {
			try {
				System.out.println("here break");
				// break;
				i++;
				continue label2;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("finally in 2nd try block");
			}
			System.out.println("");
		}

	}
}