package com.nastation.c13;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class WindowAdapterTest extends JPanel {

	JLabel b = new JLabel("Test WindowAdapter");

	WindowAdapterTest() {
		add(b);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new WindowAdapterTest());
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); 
		frame.addWindowListener(new MyWindowListener2());
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}