package com.nastation.c14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

import javax.swing.JApplet;
import javax.swing.JButton;

import com.nastation.c13.Console;

///:Continuing
/////////// Testing Everything ///////////
public class BlockingMain extends JApplet {
	private JButton start = new JButton("Start"), stopPeekers = new JButton(
			"Stop Peekers");

	private boolean started = false;

	private Blockable[] b;

	private PipedWriter out;

	private PipedReader in;

	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (!started) {
				started = true;
				for (int i = 0; i < b.length; i++)
					b[i].start();
			}
		}
	}

	class StopPeekersL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Demonstration of the preferred
			// alternative to Thread.stop():
			for (int i = 0; i < b.length; i++)
				b[i].stopPeeker();
		}
	}

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		out = new PipedWriter();
		try {
			in = new PipedReader(out);
		} catch (IOException e) {
			System.err.println("PipedReader problem");
		}
		b = new Blockable[] { new Sleeper1(cp), new Sleeper2(cp),
				new SuspendResume1(cp), new SuspendResume2(cp),
				new WaitNotify1(cp), new WaitNotify2(cp), new Sender(cp, out),
				new Receiver(cp, in) };
		start.addActionListener(new StartL());
		cp.add(start);
		stopPeekers.addActionListener(new StopPeekersL());
		cp.add(stopPeekers);
	}

	public static void main(String[] args) {
		Console.run(new BlockingMain(), 350, 550);
	}
}