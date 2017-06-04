package com.nastation.c10;

//: c10:WithFinally.java
//Finally Guarantees cleanup.
public class WithFinally {
	static Switch sw = new Switch();

	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			System.err.println("OnOffException1");
		} catch (OnOffException2 e) {
			System.err.println("OnOffException2");
		} finally {
			sw.off();
		}
	}
}