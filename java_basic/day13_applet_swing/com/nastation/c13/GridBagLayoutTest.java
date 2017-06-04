package com.nastation.c13;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class GridBagLayoutTest extends JApplet {

	public void init() {
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		JButton b1 = new JButton("hello");
		gb.setConstraints(b1, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;		
		JButton b2 = new JButton("Kris");
		gb.setConstraints(b2, gbc);
		
		
		Container c = getContentPane();
		c.setLayout(gb);
		c.add(b1);
		c.add(b2);

	}

}
