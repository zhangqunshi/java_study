package com.nastation.c13;

//: c13:List.java
//<applet code=List width=250
//height=375> </applet>
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JApplet;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List2 extends JApplet {

	DefaultListModel lItems = new DefaultListModel();
	JList lst = new JList(lItems);

	public void init() {
		//往JList中增加数据
		for (int i = 0; i < 8; i++) {
			lItems.addElement("kris" + i);
		}

		lst.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Object[] items = lst.getSelectedValues();
				for (int i = 0; i < items.length; i++) {
					System.out.print(items[i]);
				}
			}
		});
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(lst);
	}
}