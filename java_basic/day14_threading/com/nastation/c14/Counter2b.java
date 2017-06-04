package com.nastation.c14;

//: c14:Counter2.java
//A responsive user interface with threads.
//<applet code=Counter2 width=300 height=100>
//</applet>
import javax.swing.*;

import com.nastation.c13.Console;

import java.awt.*;
import java.awt.event.*;

public class Counter2b extends JApplet {

	private class SeparateSubTask extends Thread {
		private int count = 0;

		private boolean runFlag = true;

		SeparateSubTask() {
			start();
		}

		void invertFlag() {
			runFlag = !runFlag;
		}
		
		void stopIt() {
			runFlag = false;
		}
		
		void starIt() {
			runFlag = true;
		}

		void clear() {
			count = 0;
		}

		public void run() {
			while (true) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					System.err.println("Interrupted");
				}
				if (runFlag) {
					t.setText(Integer.toString(count++));
				}
			}
		}
	}

	private SeparateSubTask sp = null;

	private JTextField t = new JTextField(10);

	private JButton start = new JButton("Start"),
			onOff = new JButton("Toggle");

	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sp == null) {
				sp = new SeparateSubTask();
			}
			//start
			if (start.getText().equals("Start")) {
				start.setText("Stop");
				sp.starIt();
			} else {//stop
				t.setText("");
				sp.stopIt();
				sp.clear();
				start.setText("Start");
			}
		}
	}

	class OnOffL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sp != null)
				sp.invertFlag();
		}
	}

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		start.addActionListener(new StartL());
		cp.add(start);
		onOff.addActionListener(new OnOffL());
		cp.add(onOff);
	}

	public static void main(String[] args) {
		Console.run(new Counter2b(), 300, 100);
	}
}