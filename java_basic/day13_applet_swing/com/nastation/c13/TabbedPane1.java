package com.nastation.c13;

//: c13:TabbedPane1.java
//Demonstrates the Tabbed Pane.
//<applet code=TabbedPane1
//width=350 height=200> </applet>
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPane1 extends JApplet {
	
	String[] flavors = { "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
			"Mint Chip", "Mocha Almond Fudge", "Rum Raisin", "Praline Cream",
			"Mud Pie" };

//	JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
	JTabbedPane tabs = new JTabbedPane();

	JTextField txt = new JTextField(20);

	public void init() {
//		tabs.setLayout(new FlowLayout());
		
		for (int i = 0; i < flavors.length; i++) {
			//添加一个由 title 表示，且没有图标的 component
//			JPanel p = new JPanel();
//			p.setLayout(new FlowLayout());
//			p.add(new JButton("Tab " + i));
			tabs.addTab(flavors[i], new JButton("Tab " + i));
		}
		
		tabs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//返回当前选择的此选项卡窗格的索引
				txt.setText("Tab selected: " + tabs.getSelectedIndex());
			}
		});
		
		Container cp = getContentPane();
		cp.add(BorderLayout.SOUTH, txt);
		cp.add(tabs);
	}

	public static void main(String[] args) {
		Console.run(new TabbedPane1(), 350, 200);
	}
}