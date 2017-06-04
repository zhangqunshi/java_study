package com.nastation.c06;

class Value {
	int i = 1;
}

/**
 * final 关键字 
 * 对于对象引用final 会将引用变成一个常数,引用初始化成一个对象之后便永远不能改动它令它指向另一个对象不过对象本身却是可以修改的
 * 对于原始数据类型final 会将值变成一个常数
 * 
 * @author kris
 * 
 */
public class FinalData {
	// Can be compile-time constants
	final int i1 = 9;

	static final int VAL_TWO = 99;

	// Typical public constant:
	public static final int VAL_THREE = 39;

	// Cannot be compile-time constants:
	final int i4 = (int) (Math.random() * 20);

	static final int i5 = (int) (Math.random() * 20);

	Value v1 = new Value();

	final Value v2 = new Value();

	static final Value v3 = new Value();

	// Arrays:
	final int[] a = { 1, 2, 3, 4, 5, 6 };

	public void print(String id) {
		System.out.println(id + ": " + "i4 = " + i4 + ", i5 = " + i5);
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		// ! fd1.i1++; // Error: can't change value

		fd1.v2.i++; // Object isn't constant!
		// ! fd1.v2 = new Value(); // Error: Can't

		fd1.v1 = new Value(); // OK -- not final

		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // Object isn't constant!
		}
		// ! fd1.a = new int[3];

		// ! fd1.v3 = new Value(); // change reference

		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}