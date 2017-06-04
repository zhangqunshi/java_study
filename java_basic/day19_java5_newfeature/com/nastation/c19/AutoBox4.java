package com.nastation.c19;

import java.util.ArrayList;

public class AutoBox4 {

	public static void main(String[] args) {
		int i = 10;
		
		ArrayList list = new ArrayList();
		//自动装箱
		list.add(i);
		
		Integer i2 = (Integer)list.get(0);
		//自动拆箱
		int i3 = i2;
		
		System.out.println(i3);
		
	}
}
