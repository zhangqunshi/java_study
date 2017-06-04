package com.nastation.c13;

//: c13:ButtonGroups.java
//Uses reflection to create groups
//of different types of AbstractButton.
//<applet code=ButtonGroups width=500 height=300></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.lang.reflect.*;

public class ButtonGroups2 extends JApplet {
	
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		ButtonGroup bg = new ButtonGroup();
		
		for (int i = 0; i < 10; i++) {
//			JButton b = new JButton("Button " + i);
//			JRadioButton b = new JRadioButton("Button " + i);
//			JToggleButton b = new JToggleButton("Button " + i);
			JCheckBox b = new JCheckBox("Button " + i);
			bg.add(b);
			cp.add(b);
		}
	}

//	public static void main(String[] args) {
//		Console.run(new ButtonGroups2(), 500, 300);
//	}
}