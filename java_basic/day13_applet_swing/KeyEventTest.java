import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JTextField;

public class KeyEventTest extends JApplet {
	
	JTextField tf = new JTextField(10);

	public KeyEventTest() {

		tf.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
//				String s = String.valueOf(e.getKeyChar());
//				tf.setText(s);
			}

			public void keyTyped(KeyEvent e) {
				String s = String.valueOf(e.getKeyChar());
				System.out.println(s);
				tf.setText(s);				
			}

		});

		getContentPane().add(tf);

	}

}
