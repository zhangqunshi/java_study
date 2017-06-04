package com.nastation.c14.thread;

/**
 * ÿ��2���Ӵ�ӡһ���ַ�����Hello��+��������ӡ5�κ��˳�
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
