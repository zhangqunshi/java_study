package com.nastation.c14.thread;

/**
 * ��������ʾ
 * 
 * @author who
 * 
 */
class TicketsSystem4 {

	// �����������
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
 * ��ͬ�����ͬ������ͬʱ����
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

				// ͬ����
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

	// ͬ������ ������ʱ���this�����Ƿ������
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
