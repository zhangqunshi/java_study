package com.nastation.c13;

//: c13:MessageBoxes.java
//Demonstrates JoptionPane.
//<applet code=MessageBoxes
//width=200 height=150> </applet>
import javax.swing.*;

public class MessageBoxes2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "There's a bug on you!", "Hey!",
				JOptionPane.ERROR_MESSAGE);

		
		JOptionPane.showConfirmDialog(null, "or no", "choose yes",
				JOptionPane.YES_NO_OPTION);

		
		String val = JOptionPane.showInputDialog("How many fingers do you see?");
		System.out.println("input value=" + val);

		
		Object[] selections = { "First", "Second", "Third" };
		Object val2 = JOptionPane.showInputDialog(null, "Choose one", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, selections,
				selections[0]);
		System.out.println("input value=" + val2);
	}
}