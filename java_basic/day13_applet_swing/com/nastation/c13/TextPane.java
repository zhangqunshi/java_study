package com.nastation.c13;

//: c13:TextPane.java
//The JTextPane control is a little editor.
//<applet code=TextPane width=475 height=425>
//</applet>
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import com.nastation.c09.Arrays2;
import com.nastation.c09.Generator;

public class TextPane extends JApplet {
	JButton b = new JButton("Add Text");

	JTextPane tp = new JTextPane();

//	static Generator sg = new Arrays2.RandStringGenerator(7);

	public void init() {
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tp.setText(tp.getText() + "hello, Kris\n");
				
//				for (int i = 1; i < 10; i++)
//					tp.setText(tp.getText() + sg.next() + "\n");
			}
		});
		
		Container cp = getContentPane();
		cp.add(new JScrollPane(tp));
		cp.add(BorderLayout.SOUTH, b);
	}

	public static void main(String[] args) {
		Console.run(new TextPane(), 475, 425);
	}
}