package com.nastation.c13;

//: c13:TextFields.java
//Text fields and Java events.
//<applet code=TextFields width=375 height=125></applet>
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFields2 extends JApplet {

	JTextField t1 = new JTextField(30);
	JTextField t2 = new JTextField(30);

	public void init() {
		t1.getDocument().addDocumentListener(new T1Listener());

		setLayout(new FlowLayout());
		add(t1);
		add(t2);
	}
	
	class T1Listener implements DocumentListener {

		public void changedUpdate(DocumentEvent arg0) {
		}

		public void insertUpdate(DocumentEvent arg0) {
			t2.setText(t1.getText());
		}
		
		public void removeUpdate(DocumentEvent arg0) {
			t2.setText(t1.getText());
		}
		

	}
}