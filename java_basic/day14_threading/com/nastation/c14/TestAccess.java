package com.nastation.c14;

//: c14:TestAccess.java
//How threads can access other threads
//in a parent thread group.
//这个例子展示了位于一个叶子组内的线程能修改它所在线程组树的所有线程的优先级,
//同时还能为这个树内的所有线程都调用一个方法.

public class TestAccess {
	public static void main(String[] args) {
		ThreadGroup x = new ThreadGroup("x"), y = new ThreadGroup(x, "y"), z = new ThreadGroup(
				y, "z");
		Thread one = new TestThread1(x, "one"), two = new TestThread2(z, "two");
	}
}

class TestThread1 extends Thread {
	private int i;

	TestThread1(ThreadGroup g, String name) {
		super(g, name);
	}

	void f() {
		i++; // modify this thread
		System.out.println(getName() + " f()");
	}
}

class TestThread2 extends TestThread1 {
	TestThread2(ThreadGroup g, String name) {
		super(g, name);
		start();
	}

	public void run() {
		ThreadGroup g = getThreadGroup().getParent().getParent();
		g.list();
		Thread[] gAll = new Thread[g.activeCount()];
		g.enumerate(gAll);
		for (int i = 0; i < gAll.length; i++) {
			gAll[i].setPriority(Thread.MIN_PRIORITY);
			((TestThread1) gAll[i]).f();
		}
		g.list();
	}
}