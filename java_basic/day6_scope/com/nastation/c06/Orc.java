package com.nastation.c06;

import com.nastation.c06.access.*;

/**
 * change()ӵ�ж�set()�ķ���Ȩ����Ϊ����������protected �ܱ�����
 * @author kris
 *
 */
public class Orc extends Villain {
	private int j;

	public Orc(int jj) {
		super(jj);
		j = jj;
	}

	public void change(int x) {
		set(x);
	}
	
	public static void main(String[] args) {
		new Orc(10);
                //new Villain(99);
	}
}