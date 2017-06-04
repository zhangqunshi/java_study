package com.nastation.c13;

import java.awt.*;
import java.applet.Applet;

public class GridBagEx1 extends Applet {

	protected void makebutton(String name, GridBagLayout gridbag,
			GridBagConstraints c) {
		Button button = new Button(name);
		gridbag.setConstraints(button, c);
		add(button);
	}

	public void init() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setFont(new Font("SansSerif", Font.PLAIN, 14));
		setLayout(gridbag);

		//在水平方向和垂直方向上同时调整组件大小。
		c.fill = GridBagConstraints.BOTH;
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.fill = GridBagConstraints.VERTICAL;
//		c.fill = GridBagConstraints.NONE;
		
		//指定如何分布额外的水平空间。
//		c.weightx = 1.0;
		c.weightx = 0.0;
		
		makebutton("Button1", gridbag, c);
		makebutton("Button2", gridbag, c);
		makebutton("Button3", gridbag, c);

		//指定此组件是其行或列中的最后一个组件
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		makebutton("Button4", gridbag, c);

		c.weightx = 0.0; // reset to the default
//		c.weightx = 1.0; // reset to the default
		makebutton("Button5", gridbag, c); // another row

		//指定此组件为其行或列（gridwidth、gridheight）中的倒数第二个组件
		c.gridwidth = GridBagConstraints.RELATIVE; // next-to-last in row
		makebutton("Button6", gridbag, c);

		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		makebutton("Button7", gridbag, c);

		c.gridwidth = 1; // reset to the default
		c.gridheight = 2;
		c.weighty = 1.0;
		makebutton("Button8", gridbag, c);

		c.weighty = 0.0; // reset to the default
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		c.gridheight = 1; // reset to the default
		makebutton("Button9", gridbag, c);
		makebutton("Button10", gridbag, c);

		setSize(300, 100);
	}

	public static void main(String args[]) {
		Frame f = new Frame("GridBag Layout Example");
		GridBagEx1 ex1 = new GridBagEx1();

		ex1.init();

		f.add("Center", ex1);
		f.pack();
		f.setSize(f.getPreferredSize());
		f.show();
	}
}
