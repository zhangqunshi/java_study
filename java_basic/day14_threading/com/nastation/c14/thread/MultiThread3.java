package com.nastation.c14.thread;

/**
 * 2个线程的相互切换
 * 
 * @author Kris
 */
public class MultiThread3 {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		System.out.println("Hello");
		
		mt.start();
		while (true) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread3 extends Thread {

	public void run() {
		while (true) {
			System.out.println(getName());
		}
	}
}
