package com.nastation.c14.thread;

/**
 * �̵߳�ͬ��
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

			
			//ͬ����, һ���߳̽���󣬻���obj����������Ƿ��Ѿ�������
			//���û�м��������ͻὫobj������Ȼ������ִ�С�
//			synchronized (obj) {
//				if (tickets > 0) {
//
//					try {
//						//��һ���߳̽���sleep���ڶ����߳�ִ�С�
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
			//��һ���߳̽������ڶ����߳̽��롣
			
			sell();
		}
	}
	
	//ͬ������ ������ʱ���this�����Ƿ������
	public synchronized void sell() {
			if (tickets > 0) {

				try {
					//��һ���߳̽���sleep���ڶ����߳�ִ�С�
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
