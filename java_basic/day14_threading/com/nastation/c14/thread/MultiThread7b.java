package com.nastation.c14.thread;

/**
 * 多个线程访问index字段, index被多个线程共享
 * 
 * @author who
 * 
 */
public class MultiThread7b {

	public static void main(String[] args) {
		MyThread7b mt = new MyThread7b();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		while (true) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread7b implements Runnable {

	int index = 0;

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + ":" + index++);
		}
	}
}
