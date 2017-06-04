package com.nastation.c13;

//: c13:Dialogs.java
//Creating and using Dialog Boxes.
//<applet code=Dialogs width=125 height=75>
//</applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyDialog extends JDialog {
	
	public MyDialog(JFrame parent) {
		super(parent, "My dialog", true);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Here is my dialog"));
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Closes the dialog
			}
		});
		cp.add(ok);
		setSize(150, 125);
	}
}

public class Dialogs extends JApplet {
	
	JButton b1 = new JButton("Dialog Box");

	MyDialog dlg = new MyDialog(null);

	public void init() {
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				dlg.show();
				dlg.setVisible(true);
			}
		});
		getContentPane().add(b1);
	}

	public static void main(String[] args) {
		Console.run(new Dialogs(), 125, 75);
	}
}