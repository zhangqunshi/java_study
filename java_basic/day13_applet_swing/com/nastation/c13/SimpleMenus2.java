package com.nastation.c13;

//: c13:SimpleMenus.java
//<applet code=SimpleMenus
//width=200 height=75> </applet>
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class SimpleMenus2 extends JApplet {
	
	JTextField t = new JTextField(15);

	ActionListener a = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			t.setText(((JMenuItem) e.getSource()).getText());
		}
	};

	public void init() {		
		JMenuItem saveMenuItem = new JMenuItem("save");
		JMenuItem openMenuItem = new JMenuItem("open");
		JMenuItem exitMenuItem = new JMenuItem("exit");
		JMenuItem javaMenuItem = new JMenuItem("Java");
		JMenu menu = new JMenu("File");
		JMenu newMenu = new JMenu("New");
		JMenuBar menuBar = new JMenuBar();
		
		menu.add(saveMenuItem);		
		menu.add(openMenuItem);		
		menu.add(exitMenuItem);
		newMenu.add(javaMenuItem);
		menu.add(newMenu);
		menuBar.add(menu);		
		
		setJMenuBar(menuBar);
		Container cp = getContentPane();
		cp.add(t);
		
		saveMenuItem.addActionListener(a);
		openMenuItem.addActionListener(a);
		exitMenuItem.addActionListener(a);
	}
}