package com.nastation.c14.thread;

/**
 * 每隔2秒钟打印一个字符串“Hello”+次数。打印5次后退出
 * 
 * @author who
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {
		HelloThread ht = new HelloThread();
		new Thread(ht).start();
		new Thread(ht).start();
		new Thread(ht).start();
		new Thread(ht).start();
	}

}

class HelloThread implements Runnable {

	// wait 2 seconds.
	public final static int TIME = 500;

	int count = 0;
	Object obj = new Object();

	public void run() {

		while (true) {
			synchronized (obj) {
				if (count++ >= 100) {
					break;
				}
				try {
					Thread.sleep(TIME);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hello " + count);
			}

		}
	}
}
