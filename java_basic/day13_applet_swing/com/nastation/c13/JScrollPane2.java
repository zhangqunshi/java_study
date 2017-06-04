package com.nastation.c13;

//: c13:JScrollPanes.java
//Controlling the scrollbars in a JScrollPane.
//<applet code=JScrollPanes width=300 height=725>
//</applet>
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPane2 extends JApplet {

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JTextArea ta = new JTextArea(5, 30);
		cp.add(new JScrollPane(ta));
	}
}