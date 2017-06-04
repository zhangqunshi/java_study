package com.nastation.c13;

//: c13:Box3.java
//Using Glue.
//<applet code=Box3
//width=450 height=300> </applet>
import javax.swing.*;

public class Box3b extends JApplet {
	public void init() {
		Box bv = Box.createVerticalBox();
		bv.add(new JButton("Hello"));
		bv.add(Box.createVerticalStrut(20));
		bv.add(new JButton("Applet"));
		bv.add(Box.createVerticalGlue());
		bv.add(new JButton("World"));
		
		Box bh = Box.createHorizontalBox();
		bh.add(new JButton("Hello"));
		bh.add(Box.createHorizontalGlue());
		bh.add(new JButton("Applet"));
		bh.add(Box.createHorizontalGlue());
		bh.add(new JButton("World"));
		
		bv.add(Box.createVerticalGlue());
		bv.add(bh);
		bv.add(Box.createVerticalGlue());
		getContentPane().add(bv);
	}

	public static void main(String[] args) {
		Console.run(new Box3b(), 450, 300);
	}
}