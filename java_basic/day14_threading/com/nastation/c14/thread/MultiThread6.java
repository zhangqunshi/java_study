package com.nastation.c14.thread;
/**
 * 线程的优先级
 * @author who
 *
 */
public class MultiThread6 {

	// max_priority=10, min_priority=1, norm_priority=5
	public static void main(String[] args) {
		MyThread6 mt = new MyThread6();
		// mt.setDaemon(true);
		mt.setPriority(Thread.MAX_PRIORITY);
		mt.start();
		
		int index = 0;
		while (true) {
//			if (index++ > 1000) {
//				break;
//			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread6 extends Thread {

	public void run() {
		while (true) {
			System.out.println(getName());
			//yield();
		}
	}
}
