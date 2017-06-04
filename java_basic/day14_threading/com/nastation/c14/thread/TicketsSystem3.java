package com.nastation.c14.thread;

/**
 * ����ͬ�������Ƿ�ʹ��this��Ϊ������
 * @author who
 *
 */
class TicketsSystem3 {

	//�����������
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
 * ��ͬ�����ͬ������ͬʱ����
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

				// ͬ����, һ���߳̽���󣬻���������Ƿ��Ѿ�������
				// ���û�м��������ͻ������Ȼ������ִ�С�
//				synchronized (obj) {
				synchronized (this) {
					if (tickets > 0) {

						try {
							// ��һ���߳̽���sleep���ڶ����߳�ִ�С�
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
				// ��һ���߳̽������ڶ����߳̽��롣
			}
		}
	}

	// ͬ������ ������ʱ���this�����Ƿ������
	public synchronized void sell() {
		if (tickets > 0) {

			try {
				// ��һ���߳̽���sleep���ڶ����߳�ִ�С�
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
