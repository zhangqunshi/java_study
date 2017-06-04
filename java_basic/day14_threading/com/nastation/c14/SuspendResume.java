package com.nastation.c14;

import java.awt.Container;

///:Continuing
/////////// Blocking via suspend() ///////////
class SuspendResume extends Blockable {
	public SuspendResume(Container c) {
		super(c);
		new Resumer(this);
	}
}

class SuspendResume1 extends SuspendResume {
	public SuspendResume1(Container c) {
		super(c);
	}

	public synchronized void run() {
		while (true) {
			i++;
			update();
			suspend(); // Deprecated in Java 1.2
		}
	}
}

class SuspendResume2 extends SuspendResume {
	public SuspendResume2(Container c) {
		super(c);
	}

	public void run() {
		while (true) {
			change();
			suspend(); // Deprecated in Java 1.2
		}
	}

	public synchronized void change() {
		i++;
		update();
	}
}

class Resumer extends Thread {
	private SuspendResume sr;

	public Resumer(SuspendResume sr) {
		this.sr = sr;
		start();
	}

	public void run() {
		while (true) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
			sr.resume(); // Deprecated in Java 1.2
		}
	}
}