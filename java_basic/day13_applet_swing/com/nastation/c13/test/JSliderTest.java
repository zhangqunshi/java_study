package com.nastation.c13.test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest extends JApplet {

	LinePanel linePanel = new LinePanel();
	JSlider slider = new JSlider(-20, 50, -1);

	public void init() {
		slider.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent e) {
				linePanel.setLine(((JSlider) e.getSource()).getValue());
			}
		});

		Container c = getContentPane();
		c.add(linePanel, BorderLayout.CENTER);
		c.add(slider, BorderLayout.SOUTH);
	}

}

class LinePanel extends JPanel {

	int value = 0;

	void setLine(int value) {
		this.value = value;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int maxWidth = getWidth();
		int maxHeight = getHeight();
		int x1 = maxWidth / 4 - value;
		int y = maxHeight / 2;
		int x2 = maxWidth - x1 + value;
		System.out.println("x1=" + x1 + ",y1=" + y + ",x2=" + x2);
		g.drawLine(x1, y, x2, y);
	}

}