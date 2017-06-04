package com.nastation.c15;

//: c15:ShowHTML.java
//<applet code=ShowHTML width=100 height=50>
//</applet>
import javax.swing.*;

import com.nastation.c13.Console;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class ShowHTML extends JApplet {
	
	JButton send = new JButton("Go");

	JLabel l = new JLabel();

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		send.addActionListener(new Al());
		cp.add(send);
		cp.add(l);
	}

	class Al implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			try {
				// This could be a CGI program instead of
				// an HTML page.
				URL u = new URL(getDocumentBase(), "Applet1.html");
				System.out.println(u);
				
				// Display the output of the URL using
				// the Web browser, as an ordinary page:
				getAppletContext().showDocument(u);
			} catch (Exception e) {
				l.setText(e.toString());
			}
		}
	}

	public static void main(String[] args) {
		Console.run(new ShowHTML(), 100, 50);
	}
}