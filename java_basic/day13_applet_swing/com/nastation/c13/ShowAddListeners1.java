package com.nastation.c13;

//: c13:ShowAddListeners.java
//Display the "addXXXListener" methods of any
//Swing class.
//<applet code = ShowAddListeners
//width=500 height=400></applet>
import javax.swing.*;

import com.nastation.c12.StripQualifiers;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;

public class ShowAddListeners1 extends JApplet {
	
	Class cl;

	Method[] m;

	Constructor[] ctor;

	String[] n = new String[0];

	JTextField name = new JTextField(25);

	JTextArea results = new JTextArea(40, 65);

	class NameL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nm = name.getText().trim();
			if (nm.length() == 0) {
				results.setText("No match");
				n = new String[0];
				return;
			}
			try {
				cl = Class.forName("javax.swing." + nm);
			} catch (ClassNotFoundException ex) {
				results.setText("No match");
				return;
			}
			m = cl.getMethods();
			// Convert to an array of Strings:
			n = new String[m.length];
			for (int i = 0; i < m.length; i++)
				n[i] = m[i].toString();
			reDisplay();
		}
	}

	void reDisplay() {
		// Create the result set:
		String[] rs = new String[n.length];
		int j = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i].indexOf("add") != -1 && n[i].indexOf("Listener") != -1) {
				rs[j++] = n[i].substring(n[i].indexOf("add"));
			}
		}
		results.setText("");
		for (int i = 0; i < j; i++) {
			//results.append(StripQualifiers.strip(rs[i]) + "\n");
			results.append(rs[i] + "\n");
		}
	}

	public void init() {
		name.addActionListener(new NameL());
		
		JPanel top = new JPanel();
		top.add(new JLabel("Swing class name (press ENTER):"));
		top.add(name);
		
		Container cp = getContentPane();
		cp.add(BorderLayout.NORTH, top);
		cp.add(new JScrollPane(results));
	}

	public static void main(String[] args) {
		Console.run(new ShowAddListeners1(), 500, 400);
	}
}