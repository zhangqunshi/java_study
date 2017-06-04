import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	static final int WIDTH = 400;
	static final int HEIGHT = 300;

	MyFrame() {
		// ≥ı º¥Û–°
		setSize(WIDTH, HEIGHT);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension d = kit.getScreenSize();

		int x = (d.width - WIDTH) / 2;
		int y = (d.height - HEIGHT) / 2;

		setLocation(x, y);
		
		setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++) {
			add(new JButton("Kris" + i));
		}
	}

	public static void main(String[] args) {
		MyFrame m = new MyFrame();
		m.setVisible(true);
	}

}
