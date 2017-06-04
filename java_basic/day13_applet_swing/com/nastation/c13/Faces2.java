package com.nastation.c13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Faces2 extends JFrame {
	JButton b;
	
	boolean flag = false;
	
	Faces2() {
		setLayout(new FlowLayout());
		Icon icon = new ImageIcon(getClass().getResource("T0.gif"));
		b = new JButton("Kris", icon);
		
		b.setRolloverIcon(new ImageIcon(getClass().getResource("T1.gif")));
		b.addActionListener(new ChangeIconL());
		//b.setEnabled(false);
		b.setToolTipText("<html><h1>Kris make this example to show toolTipText!!</h1>");
		add(b);
		
		setVisible(true);
		setSize(400, 300);
	}
	
	class ChangeIconL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (flag == true) {
			    b.setIcon(new ImageIcon(getClass().getResource("T2.gif")));
			    flag = false;
			} else {
				b.setIcon(new ImageIcon(getClass().getResource("T3.gif")));
				flag = true;
			}
		}
	}
	
	public static void main(String[] args) {
		new Faces2();
	}

}
