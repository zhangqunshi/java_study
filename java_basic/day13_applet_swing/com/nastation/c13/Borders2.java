package com.nastation.c13;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Borders2 extends JApplet {
	
	public void init() {
		setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("hello"));
		p1.setBorder(new TitledBorder("kris"));
		
		add(p1);
	}

}
