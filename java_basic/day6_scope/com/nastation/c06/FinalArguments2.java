package com.nastation.c06;

/**
 * final ²ÎÊý
 * 
 * @author kris
 * 
 */
public class FinalArguments2 {

	int m1(final int g) {
		// g++;
		return g;
	}

	void m2(int g) {
		g = 8;
	}

	FinalArguments2() {
	}

	public static void main(String[] args) {
		FinalArguments2 bf = new FinalArguments2();
//		bf.FinalArguments2();
		bf.m1(4);
		bf.m2(4);
	}
}