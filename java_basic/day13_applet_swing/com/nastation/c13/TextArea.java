package com.nastation.c13;

//: c13:TextArea.java
//Using the JTextArea control.
//<applet code=TextArea width=475 height=425>
//</applet>
import javax.swing.*;

import com.nastation.c09.Collections2;
import com.nastation.c09.CountryCapitals;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class TextArea extends JApplet {
	
	JButton b = new JButton("Add Data");
	JButton c = new JButton("Clear Data");
	
	JTextArea t = new JTextArea(20, 40);
	
	Map m = new HashMap();

	public void init() {
		t.setText("Hello, Kris");

		// Use up all the data:
		Collections2.fill(m, Collections2.geography, CountryCapitals.pairs.length);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Iterator it = m.entrySet().iterator(); it.hasNext();) {
					Map.Entry me = (Map.Entry) (it.next());
					t.append(me.getKey() + ": " + me.getValue() + "\n");
				}
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JScrollPane(t));
//		cp.add(t);
		cp.add(b);
		cp.add(c);
	}

	// public static void main(String[] args) {
	// Console.run(new TextArea(), 475, 425);
	// }
}