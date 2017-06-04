package com.nastation.c16;

public class Alias1 {
	int i;

	Alias1(int ii) {
		i = ii;
	}

	public static void main(String[] args) {
		Alias1 x = new Alias1(7);
		Alias1 y = x; // Assign the reference
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
		System.out.println("Incrementing x");
		x.i++;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
	}
}