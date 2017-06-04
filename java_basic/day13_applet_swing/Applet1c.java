//: c13:Applet1c.java
// An application and an applet.
// <applet code=Applet1c width=100 height=50>
// </applet>
import javax.swing.*;

import com.nastation.c13.Console;

public class Applet1c extends JApplet {
	public void init() {
		getContentPane().add(new JLabel("Applet!"));
	}

	// A main() for the application:
	public static void main(String[] args) {
		JApplet applet = new Applet1c();
		JFrame frame = new JFrame("Applet1c");
		// To close the application:
		Console.setupClosing(frame);
		frame.getContentPane().add(applet);
		frame.setSize(100, 50);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}