package com.nastation.c06;

/**
 * final ��
 * ���ඨ���final ����ֻ�ǽ�ֹ���м̳�û�и��������
 * ��������ֹ�˼̳�����һ��final ���е����з�����Ĭ��Ϊfinal ��Ϊ��ʱ��Ҳ�޷���������
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