package com.nastation.c19;

import java.util.ArrayList;

public class ForEach2 {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		
		for(Object x : a) {
			System.out.println(x);
		}
	}

}
