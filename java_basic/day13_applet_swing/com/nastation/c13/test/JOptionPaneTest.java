package com.nastation.c13.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JOptionPaneTest extends JApplet {

	JButton b1 = new JButton("message1");
	JButton b2 = new JButton("message2");
	JButton b3 = new JButton("message3");
	JButton b4 = new JButton("confirm");
	JButton b5 = new JButton("input1");
	JButton b6 = new JButton("input2");

	Object[] obj = { b1, b2, b3 };

	public void init() {
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "You are not Kris!",
						"Error!", JOptionPane.ERROR_MESSAGE);
			}

		});
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "You are Kris!", "Info!",
						JOptionPane.INFORMATION_MESSAGE);
			}

		});
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "You may be Kris!",
						"Warn!", JOptionPane.WARNING_MESSAGE);
			}

		});
		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int x = JOptionPane.showConfirmDialog(null, "Are u Kris!",
						"Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
				System.err.println(x);
			}

		});
		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String x = JOptionPane.showInputDialog(null, "Are u Kris!",
						"Input", JOptionPane.INFORMATION_MESSAGE);
				System.err.println(x);
			}

		});
		b6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Object[] obj = { "Yes", "No", "Others" };
				Object x = JOptionPane.showInputDialog(null, "Are u Kris!",
						"Input", JOptionPane.QUESTION_MESSAGE, null, 
						obj, obj[1]);
				System.err.println(x);
			}
		});

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
	}

}
