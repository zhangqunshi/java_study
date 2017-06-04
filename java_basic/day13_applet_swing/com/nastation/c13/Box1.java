package com.nastation.c13;

//: c13:Box1.java
//Vertical and horizontal BoxLayouts.
//<applet code=Box1
//width=450 height=200> </applet>
import javax.swing.*;
import java.awt.*;

public class Box1 extends JApplet {
	
	public void init() {
		Box bv = Box.createVerticalBox();
		
		for (int i = 0; i < 5; i++) {
			bv.add(new JButton("" + i)); 
		}
		
		Box bh = Box.createHorizontalBox();
		
		for (int i = 0; i < 5; i++) {
			bh.add(new JButton("" + i));
		}
		
		Container cp = getContentPane();
		cp.add(BorderLayout.EAST, bv);
		cp.add(BorderLayout.SOUTH, bh);
	}

	public static void main(String[] args) {
		Console.run(new Box1(), 450, 200);
	}
}