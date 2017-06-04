package com.nastation.c13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout2 extends JFrame {
	
	public GridLayout2() {
		setLayout(new GridLayout(2,3));
		for (int i = 0; i < 6; i++) {
			add(new JButton("Kris" + i));
		}		
	}
	
	public static void main(String[] args) {
		JFrame f = new GridLayout2();
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
