package com.nastation.c06;

import com.nastation.c06.access.*;

/**
 * change()拥有对set()的访问权限因为它的属性是protected 受保护的
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