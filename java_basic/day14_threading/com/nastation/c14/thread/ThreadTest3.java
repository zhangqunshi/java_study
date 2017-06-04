package com.nastation.c14.thread;

/**
 * 每隔2秒钟打印一个字符串“Hello”+次数。打印5次后退出
 * 
 * @author who
 * 
 */
public class ThreadTest3 {

	public static void main(String[] args) {
		HelloThread2 ht = new HelloThread2();
		ht.start();
		HelloThread2 ht2 = new HelloThread2();
		ht2.start();
		HelloThread2 ht3 = new HelloThread2();
		ht3.start();
		HelloThread2 ht4 = new HelloThread2();
		ht4.start();
		HelloThread2 ht5 = new HelloThread2();
		ht5.start();
	}

}

class HelloThread2 extends Thread {

	// wait 2 seconds.
	public final static int TIME = 10;

	static int count = 0;
	static Object obj = new Object();

	public void run() {

		while (true) {
			synchronized (obj) {
			if (count >= 10) {
				break;
			}
			try {
				Thread.sleep(TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello " + count++);
			}
		}
	}
}
