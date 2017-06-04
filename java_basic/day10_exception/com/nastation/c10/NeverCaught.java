package com.nastation.c10;

//: c10:NeverCaught.java
//Ignoring RuntimeExceptions.

public class NeverCaught {
	static void f() {
		throw new RuntimeException("From f()");
	}

	static void g() {
		f();
	}

	public static void main(String[] args) {
		g();
	}
}