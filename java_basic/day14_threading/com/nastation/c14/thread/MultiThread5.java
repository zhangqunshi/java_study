package com.nastation.c14.thread;

/**
 * yield·½·¨
 * @author who
 *
 */
public class MultiThread5 {

	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		mt.setDaemon(true);
		mt.start();
		int index = 0;
		while (true) {
			if (index++ > 1000) {
				break;
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread5 extends Thread {

	public void run() {
		while (true) {
			System.out.println(getName());
			yield();
			System.out.println("Hello kris ============ here!");
		}
	}
}
