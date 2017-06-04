package com.nastation.c16;

import java.util.ArrayList;

public class ImmutableInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			v.add(new Integer(i));
		}
		// But how do you change the int
		// inside the Integer?

	}

}
