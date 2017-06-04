package com.nastation.c14.thread;

/**
 * 使用内部类
 * @author who
 *
 */
public class MultiThread8 {

	public static void main(String[] args) {
		MyThread8 mt = new MyThread8();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		
		int index = 0;
		while (true) {
			// if (index++ > 1000) {
			// break;
			// }
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread8 {

	int index = 0;
	private class InnerThread extends Thread {

		public void run() {
			while (true) {
				System.out.println(Thread.currentThread().getName() + ":" + index++);
				// yield();
			}
		}
	}
	
	Thread getThread() {
		return new InnerThread(); 
	}
}
