package com.nastation.c13;

//: c13:Button2b.java
//Using anonymous inner classes.
//<applet code=Button2b width=200 height=75>
//</applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Button2b extends JApplet {
	
	JButton b1 = new JButton("Button 1");
	JButton b2 = new JButton("Button 2");

	JTextField txt = new JTextField(10);

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton) e.getSource()).getText();
			txt.setText(name);
		}
	};

	public void init() {
		b1.addActionListener(al);
		b2.addActionListener(al);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(txt);
	}

//	public static void main(String[] args) {
//		Console.run(new Button2b(), 200, 75);
//	}
}