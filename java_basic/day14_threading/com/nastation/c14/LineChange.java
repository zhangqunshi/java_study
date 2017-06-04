package com.nastation.c14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JPanel;

/**
 * 线的两个端点的坐标在不停地沿边框移动。
 * 
 * @author kris
 */
class LinePanel extends JPanel {

	int screenW, screenH;
	int x1, y1, x2, y2;

	public LinePanel(int w, int h) {
		screenW = w;
		screenH = h;
		x1 = y1 = 0;
		x2 = screenW;
		y2 = screenH;
		new LineThread().start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.GREEN);
		g.drawLine(x1, y1, x2, y2);
	}

	class LineThread extends Thread {
		public void run() {
			while (true) {
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (x1 <= 0 && y1 < screenH) {
					++y1;
				} else if (x1 < screenW && y1 >= screenH) {
					++x1;
				} else if (x1 >= screenW && y1 > 0) {
					--y1;
				} else if (x1 > 0 && y1 <= 0) {
					--x1;
				}
				x2 = screenW - x1;
				y2 = screenH - y1;

				repaint();
			}
		}
	}

}

public class LineChange extends JApplet {

	int screenW, screenH;
	int x1, y1, x2, y2;

	public void init() {
		setSize(800, 600);
		screenW = (int) getWidth();
		screenH = (int) getHeight();
		

		add(new LinePanel(screenW, screenH));

	}
}
