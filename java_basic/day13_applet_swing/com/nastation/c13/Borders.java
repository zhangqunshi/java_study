package com.nastation.c13;

//: c13:Borders.java
//Different Swing borders.
//<applet code=Borders
//width=500 height=300></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Borders extends JApplet {
	
	static JPanel showBorder(Border b) {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		String nm = b.getClass().toString();
		nm = nm.substring(nm.lastIndexOf('.') + 1);
		jp.add(new JLabel(nm, JLabel.CENTER), BorderLayout.CENTER);
		jp.setBorder(b);
		return jp;
	}

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.setLayout(new GridLayout(2, 4));
		cp.add(showBorder(new TitledBorder("Title")));
		cp.add(showBorder(new EtchedBorder()));
		cp.add(showBorder(new LineBorder(Color.blue, 5)));
		cp.add(showBorder(new MatteBorder(5, 5, 30, 30, Color.green)));
		cp.add(showBorder(new BevelBorder(BevelBorder.RAISED)));
		cp.add(showBorder(new SoftBevelBorder(BevelBorder.LOWERED)));
		cp.add(showBorder(new CompoundBorder(new EtchedBorder(),
				new LineBorder(Color.red))));
	}

	public static void main(String[] args) {
		Console.run(new Borders(), 500, 300);
	}
}