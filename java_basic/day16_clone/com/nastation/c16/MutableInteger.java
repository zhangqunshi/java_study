package com.nastation.c16;

//A changeable wrapper class.
import java.util.*;

class IntValue {
	int n;

	IntValue(int x) {
		n = x;
	}

	public String toString() {
		return Integer.toString(n);
	}
}

public class MutableInteger {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		for (int i = 0; i < 10; i++) {
			v.add(new IntValue(i));
		}
		System.out.println(v);
		
		for (int i = 0; i < v.size(); i++) {
			((IntValue) v.get(i)).n++;
		}
		System.out.println(v);
	}
}