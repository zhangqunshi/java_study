package com.nastation.c19;

public class AutoBox2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = a;
		System.out.println("a=" + a + ",b=" + b);
		
		b = new Integer(2);
		System.out.println("a=" + a + ",b=" + b);
	}

}
