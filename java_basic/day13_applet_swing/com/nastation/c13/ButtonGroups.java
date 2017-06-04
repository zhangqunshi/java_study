package com.nastation.c13;

//: c13:ButtonGroups.java
//Uses reflection to create groups
//of different types of AbstractButton.
//<applet code=ButtonGroups width=500 height=300></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.lang.reflect.*;

public class ButtonGroups extends JApplet {
	
	static String[] ids = { "June", "Ward", "Beaver", "Wally", "Eddie",	"Lumpy", };

	static JPanel makeBPanel(Class bClass, String[] ids) {
		
		ButtonGroup bg = new ButtonGroup();
		JPanel jp = new JPanel();
		String title = bClass.getName();
		title = title.substring(title.lastIndexOf('.') + 1);
		jp.setBorder(new TitledBorder(title));
		
		for (int i = 0; i < ids.length; i++) {
			AbstractButton ab = new JButton("failed");
			try {
				// Get the dynamic constructor method
				// that takes a String argument:
				Constructor ctor = bClass.getConstructor(new Class[] { String.class });
				
				// Create a new object:
				ab = (AbstractButton) ctor.newInstance(new Object[] { ids[i] });
			} catch (Exception ex) {
				System.err.println("can't create " + bClass);
			}
			bg.add(ab);
			jp.add(ab);
		}
		return jp;
	}

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(makeBPanel(JButton.class, ids));
		cp.add(makeBPanel(JToggleButton.class, ids));
		cp.add(makeBPanel(JCheckBox.class, ids));
		cp.add(makeBPanel(JRadioButton.class, ids));
	}

	public static void main(String[] args) {
		Console.run(new ButtonGroups(), 500, 300);
	}
}