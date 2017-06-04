package com.nastation.c19;

import java.util.ArrayList;
import java.util.List;

public class GeneralProgram2 {
	
	public static <T> List<T> toList(T[] array) {
		List<T> list = new ArrayList<T>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		String[] a = {"one", "two", "three"};
		List<String> b = toList(a);
		
		for(String x : b) {
			System.out.println(x);
		}
	}

}
