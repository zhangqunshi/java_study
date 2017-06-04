import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrameTest {
	public static void main(String[] args) {
		new MyFrame1();
	}
}

class MyFrame1 extends JFrame {
	JButton jb = new JButton("Click me!");
	JTextField jt = new JTextField("", 10);

	public MyFrame1() {
		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		add(jb);
		add(jt);
		jb.addActionListener(new Action1());
	}

	public class Action1 implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			jt.setText("Hello, world");
		}
	}
}
