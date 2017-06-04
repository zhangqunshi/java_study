package com.nastation.c13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JTextField;

//<applet code=ComboBoxes2 width=500 height=400></applet>
//using: appletviewer ComboBoxes2.java
public class ComboBoxes2 extends JApplet {
	
	JComboBox c = new JComboBox();
	JTextField tf = new JTextField(20);
	
	public void init() {
		setLayout(new FlowLayout());
		
		c.addItem("Kris1");
		c.addItem("Kris2");
		c.addItem("Kris3");
		
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(c.getSelectedItem().toString());
			}
		});
		
		tf.setEditable(false);
		
		add(c);
		add(tf);
		
	}

}
