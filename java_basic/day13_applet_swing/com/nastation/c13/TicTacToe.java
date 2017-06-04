package com.nastation.c13;

//: c13:TicTacToe.java
//Demonstration of dialog boxes
//and creating your own components.
//<applet code=TicTacToe
//width=200 height=100></applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * TicTacToe 通过创建JTextField 这些文本字段
 * 用于输入按钮网格的行数和列数,以及go 按钮并加上
 * 它的ActionListener 监听器从而建立起一个完整
 * 的应用程序. 按下按钮后必须取得JTextField 中
 * 的数据, 而且由于数据原本采用的是字串格式所以还
 * 得转换成int 数值具体转换是由
 * static Integer.parseInt()方法来完成的.
 */
public class TicTacToe extends JApplet {
	
	JTextField rows = new JTextField("3");
	JTextField cols = new JTextField("3");

	static final int BLANK = 0, XX = 1, OO = 2;

	/**
	 * ToeDialog 的构造函数十分简单
	 * 它根据我们的意愿在GridLayout 
	 * 里添加指定数量的按钮然后,针对
	 * 每个按钮按一边50 像素的规格
	 * 改变它们的大小
	 */
	class ToeDialog extends JDialog {
		int turn = XX; // Start with x's turn
		// w = number of cells wide
		// h = number of cells high

		public ToeDialog(int w, int h) {
			setTitle("The game itself");
			Container cp = getContentPane();
			cp.setLayout(new GridLayout(w, h));
			for (int i = 0; i < w * h; i++) {
				cp.add(new ToeButton());
			}
			setSize(w * 50, h * 50);
			// JDK 1.3 close dialog:
			// #setDefaultCloseOperation(
			// # DISPOSE_ON_CLOSE);
			// JDK 1.2 close dialog:
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
		}

		class ToeButton extends JPanel {
			int state = BLANK;

			public ToeButton() {
				addMouseListener(new ML());
			}

			/**
			 * 用于围绕面板Panel 画一个方框并负责x 和o 的描绘
			 */
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int x1 = 0;
				int y1 = 0;
				int x2 = getSize().width - 1;
				int y2 = getSize().height - 1;
				g.drawRect(x1, y1, x2, y2);
				x1 = x2 / 4;
				y1 = y2 / 4;
				int wide = x2 / 2;
				int high = y2 / 2;
				if (state == XX) {
					g.drawLine(x1, y1, x1 + wide, y1 + high);
					g.drawLine(x1, y1 + high, x1 + wide, y1);
				}
				if (state == OO) {
					g.drawOval(x1, y1, x1 + wide / 2, y1 + high / 2);
				}
			}

			/**
			 * 鼠标点击事件由MouseListener 这个监听器负责捕捉
			 * 它首先检查面板上是否写入了什么东西,如果没有则对父
			 * 窗口进行查询,调查是谁打开这个面板的并据此建立ToeButton
			 * 的状态. 通过内部类机制ToeButton 随后可自由地同自己的父
			 * 沟通并改变次序. 假如按钮上已经显示了一个x 或o 则翻转
			 * 这一次序. 一个状态发生改变后便重画一遍ToeButton
			 */
			class ML extends MouseAdapter {
				public void mousePressed(MouseEvent e) {
					if (state == BLANK) {
						state = turn;
						turn = (turn == XX ? OO : XX);
					} else
						state = (state == XX ? OO : XX);
					repaint();
				}
			}
		}
	}

	class BL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JDialog d = new ToeDialog(Integer.parseInt(rows.getText()), Integer
					.parseInt(cols.getText()));
			d.setVisible(true);
		}
	}

	public void init() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Rows", JLabel.CENTER));
		p.add(rows);
		p.add(new JLabel("Columns", JLabel.CENTER));
		p.add(cols);
		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);
		JButton b = new JButton("go");
		b.addActionListener(new BL());
		cp.add(b, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Console.run(new TicTacToe(), 200, 100);
	}
}