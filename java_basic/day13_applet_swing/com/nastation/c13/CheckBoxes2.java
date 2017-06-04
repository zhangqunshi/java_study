package com.nastation.c13;

//: c13:CheckBoxes.java
//Using JCheckBoxes.
//<applet code=CheckBoxes width=200 height=200>
//</applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxes2 extends JApplet {

	JTextArea t = new JTextArea(6, 15);

	JCheckBox cb1 = new JCheckBox("Check Box 1");

	public void init() {
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb1.isSelected())
					t.append("Box Set\n");
				else
					t.append("Box Cleared\n");
			}
		});

		setLayout(new FlowLayout());
		add(new JScrollPane(t));
		add(cb1);
	}
}