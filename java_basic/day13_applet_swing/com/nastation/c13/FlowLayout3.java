package com.nastation.c13;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class FlowLayout3 extends JApplet {
	
	public void init() {
		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.setLayout(new FlowLayout(FlowLayout.LEFT));
//		c.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		c.setLayout(new FlowLayout(FlowLayout.LEADING));
		
//		c.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		//c.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		c.setLayout(new FlowLayout(FlowLayout.TRAILING));
		c.add(new JButton("hello"));
		c.add(new JButton("Kris"));
	}

}
