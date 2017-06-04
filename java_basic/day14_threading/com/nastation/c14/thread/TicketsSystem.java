package com.nastation.c14.thread;

/**
 * 火车票售票系统
 * @author who
 *
 */
class TicketsSystem {

	public static void main(String[] args) {

		SellThread st = new SellThread();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
	}
}

class SellThread implements Runnable {

	int tickets = 2;

	public void run() {
		while (true) {
			if (tickets > 0) {
				
				//出现负值			
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ "Sell Tickets:" + tickets);
				tickets--;
			} else {
				break;
			}
		}
	}
}
