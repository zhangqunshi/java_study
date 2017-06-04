package com.nastation.c14;

//: c14:Suspend.java
//The alternative approach to using suspend()
//and resume(), which are deprecated in Java 2.
//<applet code=Suspend width=300 height=100>
//</applet>
import javax.swing.*;

import com.nastation.c13.Console;

import java.awt.*;
import java.awt.event.*;

public class Suspend extends JApplet {
	
	private JTextField t = new JTextField(10);

	private JButton suspend = new JButton("Suspend"), resume = new JButton(
			"Resume");

	private Suspendable ss = new Suspendable();

	class Suspendable extends Thread {
		private int count = 0;

		private boolean suspended = false;

		public Suspendable() {
			start();
		}

		public void fauxSuspend() {
			suspended = true;
		}

		public synchronized void fauxResume() {
			suspended = false;
			notify();
		}

		public void run() {
			while (true) {
				try {
					sleep(100);
					synchronized (this) {
						while (suspended)
							wait();
					}
				} catch (InterruptedException e) {
					System.err.println("Interrupted");
				}
				t.setText(Integer.toString(count++));
			}
		}
	}

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		suspend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss.fauxSuspend();
			}
		});
		cp.add(suspend);
		resume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss.fauxResume();
			}
		});
		cp.add(resume);
	}

	public static void main(String[] args) {
		Console.run(new Suspend(), 300, 100);
	}
}