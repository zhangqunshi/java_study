package com.nastation.c14;

import java.awt.Container;

///:Continuing
/////////// Blocking via wait() ///////////

class WaitNotify1 extends Blockable {
	public WaitNotify1(Container c) {
		super(c);
	}

	public synchronized void run() {
		while (true) {
			i++;
			update();
			try {
				wait(1000);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		}
	}
}

class WaitNotify2 extends Blockable {
	public WaitNotify2(Container c) {
		super(c);
		new Notifier(this);
	}

	public synchronized void run() {
		while (true) {
			i++;
			update();
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		}
	}
}

class Notifier extends Thread {
	private WaitNotify2 wn2;

	public Notifier(WaitNotify2 wn2) {
		this.wn2 = wn2;
		start();
	}

	public void run() {
		while (true) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
			synchronized (wn2) {
				wn2.notify();
			}
		}
	}
}