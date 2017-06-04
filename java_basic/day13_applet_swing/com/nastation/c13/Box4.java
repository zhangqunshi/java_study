package com.nastation.c13;

//: c13:Box4.java
//Rigid Areas are like pairs of struts.
//<applet code=Box4
//width=450 height=300> </applet>
import javax.swing.*;
import java.awt.*;

public class Box4 extends JApplet {
	public void init() {
		Box bv = Box.createVerticalBox();
		bv.add(new JButton("Top"));
		bv.add(Box.createRigidArea(new Dimension(120, 90)));
		bv.add(new JButton("Bottom"));
		
		Box bh = Box.createHorizontalBox();
		bh.add(new JButton("Left"));
		bh.add(Box.createRigidArea(new Dimension(160, 80)));
		bh.add(new JButton("Right"));
		bv.add(bh);
		getContentPane().add(bv);
	}

//	public static void main(String[] args) {
//		Console.run(new Box4(), 450, 300);
//	}
}