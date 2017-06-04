package com.nastation.c10;

//: c10:ExceptionMethods.java
//Demonstrating the Exception Methods.

public class ExceptionMethods {
	
	public static void main(String[] args) {
		try {
			throw new Exception("Here's my Exception");
		} catch (Exception e) {
			System.err.println("Caught Exception");
			System.err.println("e.getMessage(): " + e.getMessage());
			System.err.println("e.getLocalizedMessage(): "
					+ e.getLocalizedMessage());
			System.err.println("e.toString(): " + e);
			System.err.println("e.printStackTrace():");
			e.printStackTrace(System.err);
		}
	}
}