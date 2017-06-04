package com.nastation.c06;

class WaterSource {
	private String s;
	private String s2;

	WaterSource() {
		System.out.println("WaterSource()");
		s = new String("hello");
		s2 = new String("hello2");
	}

	public String toString() {
		return s;
	}
	
	public String print() {
		return s + "," + s2;
	}
}

/**
 * ºÏ³ÉÀý×Ó
 * @author kris
 *
 */
public class SprinklerSystem {
	private String valve1, valve2, valve3, valve4;

	WaterSource source;

	int i;

	float f;

	void print() {
		source =  new WaterSource();
		System.out.println("valve1 = " + valve1);
		System.out.println("valve2 = " + valve2);
		System.out.println("valve3 = " + valve3);
		System.out.println("valve4 = " + valve4);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("source = " + source);
	}

	public static void main(String[] args) {
		SprinklerSystem x = new SprinklerSystem();
		x.print();
	}
}


