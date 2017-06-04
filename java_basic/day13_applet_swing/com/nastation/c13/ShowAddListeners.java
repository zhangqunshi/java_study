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
import java.util.ArrayList;

public class ShowAddListeners extends JApplet {
	
	JTextField tf;
	JTextArea ta;
	
	class NameL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			//取得文本框中的文本
			String className = tf.getText();
			
			try {
				Class c = Class.forName("javax.swing." + className);//获得class对象
				Method[] m = c.getMethods(); //获得所有方法
				
				ta.setText("");
				for (int i = 0; i < m.length; i++) {
					String methodName = m[i].getName();
					if ((methodName.indexOf("add")!=-1) && (methodName.indexOf("Listener")!=-1)) {
						ta.append(methodName);
						ta.append("\n");
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void init() {
		JPanel topPanel = new JPanel();
		JLabel topLabel = new JLabel("Enter the class name: ");
		tf = new JTextField(20);
		tf.addActionListener(new NameL());
		topPanel.add(topLabel);
		topPanel.add(tf);
		
		ta = new JTextArea();
		
		add(topPanel, BorderLayout.NORTH);
		add(new JScrollPane(ta), BorderLayout.CENTER);
		
	}
}