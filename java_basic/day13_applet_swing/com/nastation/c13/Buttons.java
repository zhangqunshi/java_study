package com.nastation.c13;

//: c13:Buttons.java
//Various Swing buttons.
//<applet code=Buttons
//width=350 height=100></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.*;
import javax.swing.border.*;

public class Buttons extends JApplet {
	
	private JButton jb = new JButton("JButton Kris");

	private BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH);
	private BasicArrowButton down = new BasicArrowButton(BasicArrowButton.SOUTH);
	private BasicArrowButton right = new BasicArrowButton(BasicArrowButton.EAST);
	private BasicArrowButton left = new BasicArrowButton(BasicArrowButton.WEST);

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jb);
		cp.add(new JToggleButton("JToggleButton"));
		cp.add(new JCheckBox("JCheckBox"));
		cp.add(new JRadioButton("JRadioButton"));
		
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		jp.add(up);
		jp.add(down);
		jp.add(left);
		jp.add(right);
		cp.add(jp);
	}

	public static void main(String[] args) {
		Console.run(new Buttons(), 350, 100);
	}
}