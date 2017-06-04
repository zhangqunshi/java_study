package com.nastation.c13;

//: c13:BorderLayout1.java
//Demonstrates BorderLayout.
//<applet code=BorderLayout1
//width=300 height=250> </applet>
import javax.swing.*;
import java.awt.*;

public class BorderLayout1 extends JApplet {

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(new JButton("North"), BorderLayout.NORTH);
		cp.add(new JButton("South"), BorderLayout.SOUTH);
		cp.add(new JButton("East"), BorderLayout.EAST);
		cp.add(new JButton("West"), BorderLayout.WEST);
		cp.add(new JButton("Center"), BorderLayout.CENTER);
	}

//	public static void main(String[] args) {
//		Console.run(new BorderLayout1(), 300, 250);
//	}
}