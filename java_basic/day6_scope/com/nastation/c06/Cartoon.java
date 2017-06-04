package com.nastation.c06;

/**
 * 在派生类的构造函数中Java 会自动插入对基类构造函数的调用
 * 
 * @author kris
 * 
 */
class Art {
	
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

/**
 * 即使没有为Cartoon()创建一个构造函数编译器也会为我们 自动
 * 合成一个默认构造函数并发出对基类构造函数的调用
 * 
 * @author kris
 * 
 */
public class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}