package com.nastation.c10;

//: c10:LostMessage.java
//How an exception can be lost.

class VeryImportantException extends Exception {
	static int i = 0;

	VeryImportantException() {
		i++;
	}

	public String toString() {
		return "A very important exception!" + i;
	}
}

class HoHumException extends Exception {

	static int i = 0;

	HoHumException() {
		i++;
	}

	public String toString() {
		return "A trivial exception" + i;
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) throws Exception {
		LostMessage lm = new LostMessage();
		try {
			lm.f();
		} finally {
			lm.dispose();
		}
	}
}