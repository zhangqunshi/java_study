package com.nastation.c13;

//: c13:FileChooserTest.java
//Demonstration of File dialog boxes.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 下面这个应用程序为大家展示了两种形式的JFileChooser 对话框
 * 一个用于打开另一个则用于保存.
 */
public class FileChooserTest extends JFrame {
	
	JTextField filename = new JTextField();
	JTextField dir = new JTextField();

	JButton open = new JButton("Open");
	JButton save = new JButton("Save");

	public FileChooserTest() {
		JPanel p = new JPanel();
		open.addActionListener(new OpenL());
		p.add(open);
		save.addActionListener(new SaveL());
		p.add(save);
		Container cp = getContentPane();
		cp.add(p, BorderLayout.SOUTH);
		dir.setEditable(false);
		filename.setEditable(false);
		p = new JPanel();
		p.setLayout(new GridLayout(2, 1));
		p.add(filename);
		p.add(dir);
		cp.add(p, BorderLayout.NORTH);
	}

	class OpenL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser c = new JFileChooser();
			// Demonstrate "Open" dialog:
			int rVal = c.showOpenDialog(FileChooserTest.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				filename.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				filename.setText("You pressed cancel");
				dir.setText("");
			}
		}
	}

	class SaveL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser c = new JFileChooser();
			// Demonstrate "Save" dialog:
			int rVal = c.showSaveDialog(FileChooserTest.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				filename.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				filename.setText("You pressed cancel");
				dir.setText("");
			}
		}
	}

	public static void main(String[] args) {
		Console.run(new FileChooserTest(), 250, 110);
	}
}