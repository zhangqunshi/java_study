package com.nastation.c14.thread;

/**
 * ����̷߳���index�ֶ�, index������̹߳���
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
