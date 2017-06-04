package com.nastation.c19.test;

public class GeneralTest<T> {

	T x;

	GeneralTest(T y) {
		x = y;
	}

	void print() {
		System.out.println(x);
	}

}
