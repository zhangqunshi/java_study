package com.nastation.c13;

//: c13:ComboBoxes.java
//Using drop-down lists.
//<applet code=ComboBoxes
//width=200 height=100> </applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboBoxes extends JApplet {
	String[] description = { "Ebullient", "Obtuse", "Recalcitrant",
			"Brilliant", "Somnescent", "Timorous", "Florid", "Putrescent" };

	JTextField t = new JTextField(15);

	JComboBox c = new JComboBox();

	JButton b = new JButton("Add items");

	int count = 0;

	public void init() {

		for (int i = 0; i < 4; i++) {
			// 为列表添加项
			c.addItem(description[count++]);
			
		}
//		c.setEditable(true);
		t.setEditable(false);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < description.length)
					c.addItem(description[count++]);
			}
		});

		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 返回列表中与给定项匹配的第一个选项
				t.setText("index: " + c.getSelectedIndex() + " "
				// 返回当前所选项
						+ ((JComboBox) e.getSource()).getSelectedItem());
			}
		});

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		cp.add(c);
		cp.add(b);
	}

	public static void main(String[] args) {
		Console.run(new ComboBoxes(), 200, 100);
	}
}