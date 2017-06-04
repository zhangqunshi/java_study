package com.nastation.c13;

//: c13:Button1.java
//Putting buttons on an applet.
//<applet code=Button1 width=200 height=50>
//</applet>
import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JApplet {
	
	JButton b1 = new JButton("Button 1");
	JButton b2 = new JButton("Button 2");
	JButton b3 = new JButton("Button 3");

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(null);
		
		b1.setBounds(0, 0, 100, 30);
		b2.setBounds(20, 20, 200, 50);
		b3.setBounds(200, 200, 100, 50);
		
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
	}

//	public static void main(String[] args) {
//		Console.run(new AbsolutePosition(), 200, 50);
//	}
}
