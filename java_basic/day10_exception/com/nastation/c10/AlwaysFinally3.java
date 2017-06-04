package com.nastation.c10;

//: c10:AlwaysFinally.java
//Finally is always executed.
public class AlwaysFinally3 {
	public static void main(String[] args) {
	
		while (true) {
			try {
				System.out.println("here break");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("finally in 2nd try block");
			}
			System.out.println("");
		}
		System.out.println("End");

	}
}