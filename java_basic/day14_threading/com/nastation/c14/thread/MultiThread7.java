package com.nastation.c14.thread;

/**
 * 实现线程的第2种方式
 * @author who
 *
 */
public class MultiThread7 {

	public static void main(String[] args) {
		MyThread7 mt = new MyThread7();
		// mt.setDaemon(true);
		new Thread(mt).start();
		int index = 0;
		while (true) {
			// if (index++ > 1000) {
			// break;
			// }
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread7 implements Runnable {

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			// yield();
		}
	}
}
