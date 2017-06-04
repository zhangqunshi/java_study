package com.nastation.c06.access;
/**
 * protected
 * @author kris
 *
 */
public class Villain {
	private int i;

	protected int read() {
		return i;
	}

	protected void set(int ii) {
		i = ii;
	}

	protected Villain(int ii) {
		i = ii;
	}

	public int value(int m) {
		return m * i;
	}
}
