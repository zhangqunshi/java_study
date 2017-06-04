package com.nastation.c13.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ComboBoxTest extends JApplet {

	JComboBox com = new JComboBox();

	JTextField tf = new JTextField(10);

	JButton b = new JButton("Add Item");

	String[] array = { "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine", "ten" };

	int count = 0;

	public void init() {
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (count < array.length) {
					com.addItem(array[count++]);
				}
			}

		});
		
		for (int i = 0; i < 4; i++) {
			com.addItem(array[count++]);
		}
		com.setEditable(true);
		
		com.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tf.setText("Index: " + com.getSelectedIndex() + ", " + com.getSelectedItem());
			}
			
		});
		
		tf.setEditable(false);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(tf);
		c.add(com);
		c.add(b);
	}

}
