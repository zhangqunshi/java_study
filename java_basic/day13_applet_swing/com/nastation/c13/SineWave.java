package com.nastation.c13;

//: c13:SineWave.java
//Drawing with Swing, using a JSlider.
//<applet code=SineWave
//width=700 height=400></applet>
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * �������ݳ�Ա�����鶼���������ߵ�ļ��������ʹ��
 * @author who
 */
class SineDraw extends JPanel {
	
	static final int SCALEFACTOR = 200;

	/** cycles ָ�����������Ҳ����м������� */
	int cycles;

	/** points �����˹����������ߵĵ��� */
	int points;

	/** sines ���������Һ���ֵ */
	double[] sines;

	/** pts ��������JPanel��������Щ���y���� */
	int[] pts;

	SineDraw() {
		setCycles(5);
	}

	/**
	 * ������Ҫ�ĵ������������鲢���������sines ����
	 * ͨ������rapaint()��ǿ��paintComponent()�ĵ���
	 * �Ӷ�����ʣ��ļ�����ػ�����
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
	 * ����paintComponent()ʱҪ���ĵ�һ�������ǵ��÷����Ļ���汾
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

	//��ָ������Сֵ�����ֵ����ʼֵ ����һ��ˮƽ����
	JSlider cycles = new JSlider(1, 30, 5);

	public void init() {
		Container cp = getContentPane();
		cp.add(sines);
		
		cycles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//ͨ������sines �����setCycles()������ֵ�����Ч��JPanel �ᱻ�ػ�
				sines.setCycles(((JSlider) e.getSource()).getValue());
			}
		});
		cp.add(BorderLayout.SOUTH, cycles);
	}

	public static void main(String[] args) {
		Console.run(new SineWave(), 700, 400);
	}
}