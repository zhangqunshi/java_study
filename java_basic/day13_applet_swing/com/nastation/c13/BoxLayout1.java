package com.nastation.c13;

//: c13:BoxLayout1.java
//Vertical and horizontal BoxLayouts.
//<applet code=BoxLayout1
//width=450 height=200> </applet>
import javax.swing.*;
import java.awt.*;

public class BoxLayout1 extends JApplet {
	
	public void init() {
		JPanel jpv = new JPanel();
		jpv.setLayout(new BoxLayout(jpv, BoxLayout.Y_AXIS));
		
		for (int i = 0; i < 5; i++) {
			jpv.add(new JButton("Button " + i));
		}
		
		JPanel jph = new JPanel();
		jph.setLayout(new BoxLayout(jph, BoxLayout.X_AXIS));
		
		for (int i = 0; i < 5; i++) {
			jph.add(new JButton("" + i));
		}
		//Container cp = getContentPane();
//		cp.add(BorderLayout.EAST, jpv);
//		cp.add(BorderLayout.SOUTH, jph);
		//cp.setLayout(new FlowLayout());
		//cp.add(jpv);
		//cp.add(jph);
		setLayout(new FlowLayout());
		add(jpv);
		add(jph);
	}

	public static void main(String[] args) {
		Console.run(new BoxLayout1(), 450, 200);
	}
}