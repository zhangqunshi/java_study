package com.nastation.c13;

//: c13:Applet1.java
//Very simple applet.
import javax.swing.*;

public class Applet1 extends JApplet {
	public void init() {
		getContentPane().add(new JLabel("Hello, Applet!"));
	}
}
