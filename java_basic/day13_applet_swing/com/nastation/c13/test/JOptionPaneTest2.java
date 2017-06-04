package com.nastation.c13.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneTest2 extends JFrame {
	
	JButton b = new JButton("Hello");
	
	public JOptionPaneTest2() {
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JOptionPane.showMessageDialog(JOptionPaneTest2.this, "Hello,Kris");
//				JOptionPane.showMessageDialog(null, "Hello,Kris");
			}
			
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
	}
	
	public static void main(String[] args) {
		JOptionPaneTest2 frame = new JOptionPaneTest2();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
