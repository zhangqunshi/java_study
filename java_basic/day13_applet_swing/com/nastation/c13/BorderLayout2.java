package com.nastation.c13;

//: c13:BorderLayout1.java
//Demonstrates BorderLayout.
//<applet code=BorderLayout1
//width=300 height=250> </applet>
import javax.swing.*;
import java.awt.*;

public class BorderLayout2 extends JApplet {

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
//		cp.add(new JButton("North"), BorderLayout.NORTH);
//		cp.add(new JButton("South"), BorderLayout.SOUTH);
//		cp.add(new JButton("East"), BorderLayout.EAST);
//		cp.add(new JButton("West"), BorderLayout.WEST);
		cp.add(new JButton("Center1"), BorderLayout.CENTER);
		cp.add(new JButton("Center2"), BorderLayout.CENTER);
		cp.add(new JButton("Center3"), BorderLayout.CENTER);
		
		JPanel p1 = new JPanel();
		p1.add(new JButton("hello"));
		cp.add(p1, BorderLayout.CENTER);
	}

//	public static void main(String[] args) {
//		Console.run(new BorderLayout1(), 300, 250);
//	}
}