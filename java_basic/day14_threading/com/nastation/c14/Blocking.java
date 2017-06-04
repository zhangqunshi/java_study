package com.nastation.c14;

//: c14:Blocking.java
//Demonstrates the various ways a thread
//can be blocked.
//<applet code=Blocking width=350 height=550>
//</applet>
import javax.swing.*;
import java.awt.*;

////////////The basic framework ///////////
class Blockable extends Thread {
	
	private Peeker peeker;

	protected JTextField state = new JTextField(30);

	protected int i;

	public Blockable(Container c) {
		c.add(state);
		peeker = new Peeker(this, c);
	}

	public synchronized int read() {
		return i;
	}

	protected synchronized void update() {
		state.setText(getClass().getName() + " state: i = " + i);
	}

	public void stopPeeker() {
		// peeker.stop(); Deprecated in Java 1.2
		peeker.terminate(); // The preferred approach
	}
}

class Peeker extends Thread {
	private Blockable b;

	private int session;

	private JTextField status = new JTextField(30);

	private boolean stop = false;

	public Peeker(Blockable b, Container c) {
		c.add(status);
		this.b = b;
		start();
	}

	public void terminate() {
		stop = true;
	}

	public void run() {
		while (!stop) {
			status.setText(b.getClass().getName() + " Peeker " + (++session)
					+ "; value = " + b.read());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		}
	}
}