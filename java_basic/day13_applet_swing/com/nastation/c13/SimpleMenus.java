package com.nastation.c13;

//: c13:SimpleMenus.java
//<applet code=SimpleMenus
//width=200 height=75> </applet>
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleMenus extends JApplet {
	
	JTextField t = new JTextField(15);

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			t.setText(((JMenuItem) e.getSource()).getText());
		}
	};

	JMenu[] menus = { new JMenu("Winken"), new JMenu("Blinken"),
			new JMenu("Nod") };
	JMenu menuX = new JMenu("Hello");
	JMenuItem itemX = new JMenuItem("Kris");

	JMenuItem[] items = { new JMenuItem("Fee"), new JMenuItem("Fi"),
			new JMenuItem("Fo"), new JMenuItem("Zip"), new JMenuItem("Zap"),
			new JMenuItem("Zot"), new JMenuItem("Olly"), new JMenuItem("Oxen"),
			new JMenuItem("Free") };

	public void init() {

		for (int i = 0; i < items.length; i++) {
			System.out.println("i=" + i + ", i%3=" + (i % 3));
			//通过在i%3 中利用模数运算符可将菜单项分布到三个JMenu 中
			items[i].addActionListener(al);
			menus[i % 3].add(items[i]);
		}
		menuX.add(itemX);
		menus[0].add(menuX);
		
		JMenuBar mb = new JMenuBar();
		for (int i = 0; i < menus.length; i++) {
			mb.add(menus[i]);
		}
		
		setJMenuBar(mb);
		Container cp = getContentPane();
//		cp.setLayout(new FlowLayout());
		cp.add(t);
	}

	public static void main(String[] args) {
		Console.run(new SimpleMenus(), 200, 75);
	}
}