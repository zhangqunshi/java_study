package com.nastation.c14;

//: c14:Interrupt.java
//The alternative approach to using
//stop() when a thread is blocked.
//<applet code=Interrupt width=200 height=100>
//</applet>
import javax.swing.*;

import com.nastation.c13.Console;

import java.awt.*;
import java.awt.event.*;

class Blocked extends Thread {
	public synchronized void run() {
		try {
			wait(); // Blocks
		} catch (InterruptedException e) {
			System.err.println("Interrupted");
		}
		System.out.println("Exiting run()");
	}
}

public class Interrupt extends JApplet {
	private JButton interrupt = new JButton("Interrupt");

	private Blocked blocked = new Blocked();

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(interrupt);
		interrupt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button pressed");
				if (blocked == null)
					return;
				Thread remove = blocked;
				blocked = null; // to release it
				remove.interrupt();
			}
		});
		blocked.start();
	}

	public static void main(String[] args) {
		Console.run(new Interrupt(), 200, 100);
	}
}