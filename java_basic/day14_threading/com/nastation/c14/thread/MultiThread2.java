package com.nastation.c14.thread;

/**
 * 指定线程的名字
 * @author who
 *
 */
public class MultiThread2 {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2("MyThread2");
		mt.start();
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread2 extends Thread {
	
	MyThread2(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName());
	}
}
