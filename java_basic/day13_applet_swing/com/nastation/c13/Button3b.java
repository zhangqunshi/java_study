package com.nastation.c13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Button3b extends JFrame {
	
	JButton b1;
	JButton b2;
	JTextArea ta;
	
	Button3b() {
		setLayout(new FlowLayout());
		
		b1 = new JButton("Click ME");
		b2 = new JButton("Click ME!!");
		ta = new JTextArea(10, 5);
		b1.addActionListener(new HelloL());
		b2.addActionListener(new HelloL());
		add(b1);
		add(b2);
		add(new JScrollPane(ta));
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class HelloL implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Hello, kris");
		}
	}
	

	public static void main(String[] args) {
		new Button3b();
	}

}
