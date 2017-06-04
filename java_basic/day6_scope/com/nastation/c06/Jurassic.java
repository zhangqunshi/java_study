package com.nastation.c06;

/**
 * final 类
 * 将类定义成final 后结果只是禁止进行继承没有更多的限制
 * 由于它禁止了继承所以一个final 类中的所有方法都默认为final 因为此时再也无法覆盖它们
 * @author kris
 * 
 */
class SmallBrain {
}

final class Dinosaur {
	int i = 7;

	int j = 1;

	SmallBrain x = new SmallBrain();

	void f() {
	}
}

class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'


public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}