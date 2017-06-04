package com.nastation.c14.thread;

/**
 * 后台线程
 * @author who
 *
 */
public class MultiThread4 {

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
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

class MyThread4 extends Thread {

	public void run() {
		while (true) {
			System.out.println(getName());
		}
	}
}
