package com.nastation.c16;

//Passing references around.
public class PassReferences {

	static void f(PassReferences h) {
		System.out.println("h inside f(): " + h);
	}

	public static void main(String[] args) {
		PassReferences p = new PassReferences();
		System.out.println("p inside main(): " + p);
		f(p);
	}
}