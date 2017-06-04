package com.nastation.c13;

//: c13:FlowLayout1.java
//Demonstrates FlowLayout.
//<applet code=FlowLayout1
//width=300 height=250> </applet>
import javax.swing.*;
import java.awt.*;

public class FlowLayout1 extends JApplet {
	
	public void init() {
		//Container cp = getContentPane();
		
		setLayout(new FlowLayout());
		for (int i = 0; i < 20; i++)
			add(new JButton("Button " + i));
	}

//	public static void main(String[] args) {
//		Console.run(new FlowLayout1(), 300, 250);
//	}
}