package com.nastation.c14.thread;

/**
 * Thread����start����
 * @author who
 *
 */
public class ThreadTest2 {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
		a.start();
	}
}

class ThreadA extends Thread {
	
	int i = 0;
	public void run() {
		while(true) {
			if (i++ > 100) break;
			System.out.println(getName());
		}
	}
}
