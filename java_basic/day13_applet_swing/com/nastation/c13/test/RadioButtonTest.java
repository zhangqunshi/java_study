package com.nastation.c13.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonTest extends JApplet {
	
	ButtonGroup bg = new ButtonGroup();
	JRadioButton r1 = new JRadioButton("one");
	JRadioButton r2 = new JRadioButton("two");
	JRadioButton r3 = new JRadioButton("three");
	
	JTextField tf = new JTextField(10);
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			tf.setText("Radio: " + ((JRadioButton)ae.getSource()).getText());
		}
	};
	
	public void init() {
		r1.addActionListener(al);
		r2.addActionListener(al);
		r3.addActionListener(al);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(tf);
		
	}

}
