package com.nastation.c13;

//: c13:TicTacToe.java
//Demonstration of dialog boxes
//and creating your own components.
//<applet code=TicTacToe
//width=200 height=100></applet>
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TicTacToe2 extends Applet {
	
	TextField rows = new TextField("3");
	TextField cols = new TextField("3");

	static final int BLANK = 0, XX = 1, OO = 2;


	public void init() {
		Panel p = new Panel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Rows", JLabel.CENTER));
		p.add(rows);
		p.add(new JLabel("Columns", JLabel.CENTER));
		p.add(cols);
		add(p, BorderLayout.NORTH);
		JButton b = new JButton("go");
		add(b, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Console.run(new TicTacToe(), 200, 100);
	}
}