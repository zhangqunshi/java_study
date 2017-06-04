package com.nastation.c13;

//: c13:HTMLButton.java
//Putting HTML text on Swing components.
//<applet code=HTMLButton width=200 height=500>
//</applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HTMLButton extends JApplet {
	
	JButton b = new JButton("<html><b><font size=+2>"
			+ "<center>Hello!</center></font></b><br><i>Press me now!</i>");

	public void init() {
		b.setToolTipText("This is a button");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(
						new JLabel("<html>" + "<i><font size=+4>Kapow!</font></i>"));
				// Force a re-layout to
				// include the new label:
				validate();
			}
		});
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(b);
	}

//	public static void main(String[] args) {
//		Console.run(new HTMLButton(), 200, 500);
//	}
}