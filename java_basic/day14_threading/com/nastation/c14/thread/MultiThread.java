package com.nastation.c14.thread;

/**
 * �߳�����
 * @author who
 *
 */
public class MultiThread {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread extends Thread {
	
	public void run() {
		System.out.println(getName());
	}
}
