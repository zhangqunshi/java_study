package com.nastation.c13;

//: c13:Borders.java
//Different Swing borders.
//<applet code=Borders
//width=500 height=300></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Border2 extends JApplet {

	public void init() {
		JPanel jp = new JPanel();
		jp.add(new JLabel("hello"));
		jp.setBorder(new TitledBorder("kris"));
//		jp.setBorder(new EtchedBorder());
//		jp.setBorder(new LineBorder(Color.blue, 5));
//		jp.setBorder(new MatteBorder(5, 5, 30, 30, Color.green));
//		jp.setBorder(new BevelBorder(BevelBorder.RAISED));
//		jp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
//		jp.setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.red)));

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jp);

	}
}