package com.nastation.c19.test;

public class GeneralTest2 {

	Integer x;

	
	GeneralTest2(Integer y) {
		x = y;
	}

	//@Override
	@Deprecated
	static <T> void print(T s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		print("Hello");
		print(new Integer(2));
	}

}
