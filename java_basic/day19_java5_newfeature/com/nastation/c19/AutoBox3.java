package com.nastation.c19;

import java.util.ArrayList;

public class AutoBox3 {
	
	public static void main(String[] args) {
//		int a = 10;
//		ArrayList list = new ArrayList();
//		list.add(new Integer(a));
//		
//		Integer b = (Integer)list.get(0);
//		System.out.println("b=" + b.intValue());
		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		int b = (Integer)list.get(0);
//		
//		System.out.println("b=" + b);
		
		
//		Integer a = new Integer(20);
//		int b = 10;
////		int c = b + a.intValue();
//		int c = b + a;
//		System.out.println("C=" + c);
		
		
		int i = 100;
		Integer iObj = new Integer(200);
		Integer tempObj = iObj;
		iObj = new Integer(i);
		i = tempObj.intValue();
		
		System.out.println();
	}

}
