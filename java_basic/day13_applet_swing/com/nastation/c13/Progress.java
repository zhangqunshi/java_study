package com.nastation.c13;

//: c13:Progress.java
//Using progress bars and sliders.
//<applet code=Progress
//width=300 height=200></applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Progress extends JApplet {
	
	JProgressBar pb = new JProgressBar();

	JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);

	public void init() {
	
		sb.setValue(0);
		
		// ȷ���Ƿ��ڻ����ϻ��ƿ̶ȱ��
		sb.setPaintTicks(true);
		
		//�˷����������̶ȱ�ǵļ��
		sb.setMajorTickSpacing(20);
		
		//�˷������ôο̶ȱ�ǵļ��
		sb.setMinorTickSpacing(5);
		
		sb.setBorder(new TitledBorder("Slide Me"));
		pb.setModel(sb.getModel()); // Share model
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2, 1));
		cp.add(pb);
		cp.add(sb);
	}

	public static void main(String[] args) {
		Console.run(new Progress(), 300, 200);
	}
}