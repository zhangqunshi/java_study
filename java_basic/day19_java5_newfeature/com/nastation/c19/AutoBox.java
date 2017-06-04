package com.nastation.c19;


public class AutoBox {


	public static void intAutoBox() {
		int i = 100;		
		Integer iObj = 200;
		
		System.out.println("i = " + i + "; iObj = " + iObj);
		
		Integer tempObj = iObj;
		iObj = i;
		i = tempObj;
		
		System.out.println("i = " + i + "; iObj = " + iObj);		

		iObj += i + tempObj;
		i *= iObj + tempObj;
		System.out.println("i = " + i + "; iObj = " + iObj);
	}


	public static void booleanAutoBox() {
		boolean b = false;
		Boolean bObj = true;
		if (bObj) {
			System.out.println("bObj = " + bObj);
		}
		if (b || bObj) {
			b = bObj;
			System.out.println("bObj = " + bObj + "; b = " + b);
		}
	}


	public static void charAutoBox() {
		char ch = 'A';
		Character chObj = 'B';
		System.out.println("ch = " + ch + "; chObj = " + chObj);
		if (ch != chObj) {
			ch = chObj;
			System.out.println("ch = " + ch + "; chObj = " + chObj);
		}
	}

	public static void main(String[] args) {
		intAutoBox();
//		booleanAutoBox();
//		charAutoBox();
		int[] is = { 12, 34, 56 };
		//Integer[] iObjs = is;// error!!!
	}
}
