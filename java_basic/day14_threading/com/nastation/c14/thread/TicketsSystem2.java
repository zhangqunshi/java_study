package com.nastation.c14.thread;

/**
 * 线程的同步
 * @author who
 *
 */
class TicketsSystem2 {

	public static void main(String[] args) {

		SellThread2 st = new SellThread2();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
	}
}

class SellThread2 implements Runnable {

	int tickets = 100;
	Object obj = new Object();

	public void run() {
		while (true) {

			
			//同步块, 一个线程进入后，会检查obj这个监视器是否已经加锁，
			//如果没有加锁，它就会将obj加锁，然后向下执行。
//			synchronized (obj) {
//				if (tickets > 0) {
//
//					try {
//						//第一个线程进入sleep，第二个线程执行。
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "Sell Tickets:" + tickets);
//					tickets--;
//				} else {
//					break;
//				}
//			}
			//第一个线程解锁，第二个线程进入。
			
			sell();
		}
	}
	
	//同步方法 （进入时检查this对象是否加锁）
	public synchronized void sell() {
			if (tickets > 0) {

				try {
					//第一个线程进入sleep，第二个线程执行。
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ "Sell Tickets:" + tickets);
				tickets--;
			} 
	}
}
