import javax.swing.*;

public class Applet2 extends JApplet {
	public void init() {
		add(new JLabel("Applet!"));
		System.out.println("INit Applet");
	}
	
	public void start() {
		System.out.println("Applet start");
	}
	
	@Override
	public void stop() {
		System.out.println("Applet stop");
	}
	
	public void destroy() {
		System.out.println("Applet destroy");
	}
}