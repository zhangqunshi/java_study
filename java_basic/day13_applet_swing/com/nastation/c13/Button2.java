package com.nastation.c13;

//: c13:Button2.java
//Responding to button presses.
//<applet code=com.nastation.c13.Button2 width=200 height=75>
//</applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Button2 extends JApplet {
	JButton b1 = new JButton("Button 1");
	JButton b2 = new JButton("Button 2");

	JTextField txt = new JTextField("Kris", 20);

	class BL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton) e.getSource()).getText();
			String old = txt.getText();
			txt.setText(old + name);
		}
	}

	BL al = new BL();

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
//		Console.run(new Button2(), 200, 75);
//	}
}
