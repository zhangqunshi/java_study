package com.nastation.c14.thread;

/**
 * 死锁的演示
 * 
 * @author who
 * 
 */
class TicketsSystem4 {

	// 问题出在这里
	public static void main(String[] args) {

		SellThread4 st = new SellThread4();
		new Thread(st).start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.b = false;
		new Thread(st).start();
	}
}

/**
 * 让同步块和同步方法同时运行
 * 
 * @author who
 * 
 */
class SellThread4 implements Runnable {

	int tickets = 100;

	boolean b = true;

	Object obj = new Object();

	public void run() {

		if (b == false) {
			while (true) {
				sell();
			}
		} else {

			while (true) {

				// 同步块
				synchronized (obj) {
					if (tickets > 0) {

						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (this) {
							System.out.println("Obj:"
									+ Thread.currentThread().getName()
									+ "Sell Tickets:" + tickets);
							tickets--;
						}
					} else {
						break;
					}
				}
			}
		}
	}

	// 同步方法 （进入时检查this对象是否加锁）
	public synchronized void sell() {
		synchronized (obj) {
			if (tickets > 0) {

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Sell:" + Thread.currentThread().getName()
						+ "Sell Tickets:" + tickets);
				tickets--;
			}
		}
	}
}
