package com.nastation.c19.test;

public class GTTest {
	public static void main(String[] args) {
		GeneralTest<String> gt = new GeneralTest<String>("hello");
		GeneralTest gt2 = new GeneralTest("hello");
		gt.print();
		gt2.print();
	}
}
