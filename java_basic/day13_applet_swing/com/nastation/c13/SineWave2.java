package com.nastation.c13;

//: c13:SineWave.java
//Drawing with Swing, using a JSlider.
//<applet code=SineWave
//width=700 height=400></applet>
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JPanel;

/**
 * 画线
 * 
 * @author Kris
 */
class SineDraw2 extends JPanel implements MouseMotionListener {
	
	private int x;
	private int y;

	SineDraw2() {
		addMouseMotionListener(this);
	}
	
	/**
	 * 覆盖paintComponent()时要做的第一件事情是调用方法的基类版本
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		setBackground(Color.BLACK);
		g.drawLine(0, 0, x, y);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		repaint();
	}
}

public class SineWave2 extends JApplet {
	SineDraw2 sines = new SineDraw2();

	public void init() {
		Container cp = getContentPane();
		cp.add(sines);
	}
}