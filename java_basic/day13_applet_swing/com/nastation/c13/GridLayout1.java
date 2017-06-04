package com.nastation.c13;

//: c13:GridLayout1.java
//Demonstrates GridLayout.
//<applet code=GridLayout1 width=300 height=250> </applet>
import javax.swing.*;
import java.awt.*;

public class GridLayout1 extends JApplet {
	
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(7, 3));
		for (int i = 0; i < 20; i++)
			cp.add(new JButton("Button " + i));
	}

//	public static void main(String[] args) {
//		Console.run(new GridLayout1(), 300, 250);
//	}
}