package com.nastation.c14.thread;

/**
 * 测试同步方法是否使用this作为监视器
 * @author who
 *
 */
class TicketsSystem3 {

	//问题出在这里
	public static void main(String[] args) {

		SellThread3 st = new SellThread3();
		new Thread(st).start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.b = true;
		new Thread(st).start();
	}
}

/**
 * 让同步块和同步方法同时运行
 * 
 * @author who
 * 
 */
class SellThread3 implements Runnable {

	int tickets = 100;

	boolean b = false;
	
	Object obj = new Object();

	public void run() {

		if (b == false) {
			while (true) {
				sell();
			}
		} else {
			
			while (true) {

				// 同步块, 一个线程进入后，会检查监视器是否已经加锁，
				// 如果没有加锁，它就会加锁，然后向下执行。
//				synchronized (obj) {
				synchronized (this) {
					if (tickets > 0) {

						try {
							// 第一个线程进入sleep，第二个线程执行。
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Obj:" + Thread.currentThread().getName()
								+ "Sell Tickets:" + tickets);
						tickets--;
					} else {
						break;
					}
				}
				// 第一个线程解锁，第二个线程进入。
			}
		}
	}

	// 同步方法 （进入时检查this对象是否加锁）
	public synchronized void sell() {
		if (tickets > 0) {

			try {
				// 第一个线程进入sleep，第二个线程执行。
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
