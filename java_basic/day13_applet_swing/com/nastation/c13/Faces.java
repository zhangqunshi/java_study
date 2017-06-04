package com.nastation.c13;

//: c13:Faces.java
//Icon behavior in Jbuttons.
//<applet code=Faces width=250 height=100></applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Faces extends JApplet {

	// The following path information is necessary
	// to run via an applet directly from the disk:
//	static String path = "D:/course";

	static Icon[] faces;

	JButton jb;

	JButton jb2 = new JButton("Disable");

	boolean mad = false;

	public void init() {

		faces = new Icon[] {
				new ImageIcon(getClass().getResource("T0.gif")),
				new ImageIcon(getClass().getResource("T1.gif")),
				new ImageIcon(getClass().getResource("T2.gif")),
				new ImageIcon(getClass().getResource("T3.gif")),
				new ImageIcon(getClass().getResource("T4.gif")),
				
//				new ImageIcon(path + "face0.gif"),
//				new ImageIcon(path + "face1.gif"),
//				new ImageIcon(path + "face2.gif"),
//				new ImageIcon(path + "face3.gif"),
//				new ImageIcon(path + "face4.gif"),
				};

		jb = new JButton("JButton", faces[3]);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mad) {
					jb.setIcon(faces[3]);
					mad = false;
				} else {
					jb.setIcon(faces[0]);
					mad = true;
				}
				jb.setVerticalAlignment(JButton.TOP);
				jb.setHorizontalAlignment(JButton.LEFT);
			}
		});
		jb.setRolloverEnabled(true);
		jb.setRolloverIcon(faces[1]);
		jb.setPressedIcon(faces[2]);
		jb.setDisabledIcon(faces[4]);
		jb.setToolTipText("Yow! Kris");
		cp.add(jb);
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jb.isEnabled()) {
					jb.setEnabled(false);
					jb2.setText("Enable");
				} else {
					jb.setEnabled(true);
					jb2.setText("Disable");
				}
			}
		});
		cp.add(jb2);
	}

	public static void main(String[] args) {
		Console.run(new Faces(), 400, 200);
	}
}