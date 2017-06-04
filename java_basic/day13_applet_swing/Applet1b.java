
//: c13:Applet1b.java
//Embedding the applet tag for Appletviewer.
//<applet code=Applet1b width=100 height=50>
//</applet>
import javax.swing.*;

public class Applet1b extends JApplet {
	public void init() {
		getContentPane().add(new JLabel("Applet, Kris!"));
	}
}