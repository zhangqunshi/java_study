package com.nastation.c14.thread;

public class ThreadStop {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();

		int index = 0;
		while (true) {
			if (index++ == 500) {
				t1.stopThread();
//				t1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("main END");
	}

}

class Thread1 extends Thread {
	private boolean stop = false;

	public synchronized void run() {
		while (!stop) {
//			try {
//				//如果有个wait()
//				wait();
//			} catch (InterruptedException e) {
//				if (stop) {
//					return;
//				}
//			}
			System.out.println(getName());
		}
	}

	public void stopThread() {
		stop = true;
	}
}
