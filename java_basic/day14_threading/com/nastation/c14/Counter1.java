package com.nastation.c14;

//: c14:Counter1.java
//A non-responsive user interface.
//<applet code=Counter1 width=300 height=100>
//</applet>
import javax.swing.*;

import com.nastation.c13.Console;

import java.awt.event.*;
import java.awt.*;

public class Counter1 extends JApplet {
	
	private int count = 0;

	private JButton start = new JButton("Start");
	private JButton onOff = new JButton("Toggle");
	
	private JTextField t = new JTextField(10);

	private boolean runFlag = true;

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		cp.add(start);
		cp.add(onOff);
		
		start.addActionListener(new StartL());		
		onOff.addActionListener(new OnOffL());
		
	}

	/*
	 * go()方法正是程序全心全意服务的对象它将当前的count 计数值
	 * 置入JTextField,然后使count 的值递增.
	 */
	public void go() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
			if (runFlag)
				t.setText(Integer.toString(count++));
		}
	}

	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			go();
		}
	}

	class OnOffL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			runFlag = !runFlag;
		}
	}

	public static void main(String[] args) {
		Console.run(new Counter1(), 300, 100);
	}
}