package com.nastation.c06;

/**
 * 继承初始化
 * 父类的static --> 子类的static --> main函数 --> 父类的构造函数 --> 子类的成员变量 --> 子类的构造函数
 * @author kris
 *
 */
class Insect {
	int i = 9;
	int j;

	Insect() {
		prt("i = " + i + ", j = " + j);
		j = 39;
	}

	static int x1 = prt("static Insect.x1 initialized");

	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	int k = prt("Beetle.k initialized");

	Beetle() {
		prt("k = " + k);
		prt("j = " + j);
	}

	static int x2 = prt("static Beetle.x2 initialized");

	public static void main(String[] args) {
		prt("Beetle constructor");
		Beetle b = new Beetle();
	}
}