package com.nastation.c14;

import java.awt.Container;
import java.io.IOException;
import java.io.Writer;

///:Continuing
class Sender extends Blockable { // send
	private Writer out;

	public Sender(Container c, Writer out) {
		super(c);
		this.out = out;
	}

	public void run() {
		while (true) {
			for (char c = 'A'; c <= 'z'; c++) {
				try {
					i++;
					out.write(c);
					state.setText("Sender sent: " + (char) c);
					sleep((int) (3000 * Math.random()));
				} catch (InterruptedException e) {
					System.err.println("Interrupted");
				} catch (IOException e) {
					System.err.println("IO problem");
				}
			}
		}
	}
}