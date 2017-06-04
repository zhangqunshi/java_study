package com.nastation.c13;

//: c13:SineWave.java
//Drawing with Swing, using a JSlider.
//<applet code=SineWave
//width=700 height=400></applet>
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * 所有数据成员和数组都在正弦曲线点的计算过程中使用
 * @author who
 */
class SineDraw extends JPanel {
	
	static final int SCALEFACTOR = 200;

	/** cycles 指出完整的正弦波形有几个周期 */
	int cycles;

	/** points 包含了构成正弦曲线的点数 */
	int points;

	/** sines 包含了正弦函数值 */
	double[] sines;

	/** pts 包含了在JPanel上描绘的那些点的y坐标 */
	int[] pts;

	SineDraw() {
		setCycles(5);
	}

	/**
	 * 根据需要的点数来创建数组并用数字填充sines 数组
	 * 通过调用rapaint()会强制paintComponent()的调用
	 * 从而进行剩余的计算和重画操作
	 * @param newCycles
	 */
	public void setCycles(int newCycles) {
		System.out.println(newCycles);
		cycles = newCycles;
		points = SCALEFACTOR * cycles * 2;
		System.out.println("--" + points);
		sines = new double[points];
		pts = new int[points];
		for (int i = 0; i < points; i++) {
			double radians = (Math.PI / SCALEFACTOR) * i;
//			System.out.println(radians);
			sines[i] = Math.sin(radians);
		}
		repaint();
	}

	/**
	 * 覆盖paintComponent()时要做的第一件事情是调用方法的基类版本
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int maxWidth = getWidth();
		double hstep = (double) maxWidth / (double) points;
		int maxHeight = getHeight();
		for (int i = 0; i < points; i++) {
			pts[i] = (int) (sines[i] * maxHeight / 2 * .95 + maxHeight / 2);
		}
		g.setColor(Color.red);
		for (int i = 1; i < points; i++) {
			int x1 = (int) ((i - 1) * hstep);
			int x2 = (int) (i * hstep);
			int y1 = pts[i - 1];
			int y2 = pts[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}
}

public class SineWave extends JApplet {
	SineDraw sines = new SineDraw();

	//用指定的最小值、最大值和起始值 创建一个水平滑块
	JSlider cycles = new JSlider(1, 30, 5);

	public void init() {
		Container cp = getContentPane();
		cp.add(sines);
		
		cycles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//通过调用sines 对象的setCycles()方法新值便会生效而JPanel 会被重画
				sines.setCycles(((JSlider) e.getSource()).getValue());
			}
		});
		cp.add(BorderLayout.SOUTH, cycles);
	}

	public static void main(String[] args) {
		Console.run(new SineWave(), 700, 400);
	}
}