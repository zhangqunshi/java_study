package com.nastation.c10;

//: c10:OnOffSwitch.java
//Why use finally?
class Switch {
	boolean state = false;

	boolean read() {
		return state;
	}

	void on() {
		state = true;
		System.out.println("on");
	}

	void off() {
		state = false;
		System.out.println("off");
	}
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

public class OnOffSwitch {
	static Switch sw = new Switch();

	static void f() throws OnOffException1, OnOffException2 {
		throw new OnOffException1();
	}

	public static void main(String[] args) {
		System.out.println("Begin");
		try {
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
		} catch (OnOffException1 e) {
			System.err.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 e) {
			System.err.println("OnOffException2");
			sw.off();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}