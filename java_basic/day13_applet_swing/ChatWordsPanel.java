import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class ChatWordsPanel extends JPanel {

	JTextPane tp = new JTextPane();
	StringBuffer sb = new StringBuffer("<html>");
	boolean isRed = false;

	ChatWordsPanel() {
		setLayout(new BorderLayout());

		tp.setEditable(false);
		tp.setContentType("text/html");
		add(new JScrollPane(tp));
	}

	public JTextPane getTextPane() {
		return tp;
	}

	public void addWords(String text) {
		sb.append(convertHtml(text));
		isRed = (isRed == true) ? false : true;
		tp.setText(sb.toString());
	}

	private String convertHtml(String s) {
		String ret;
		if (isRed) {
			ret = "<div style=\"color:red\">" + s + "</div>";
		} else {
			ret = "<div>" + s + "</div>";
		}
		return ret;
	}

}
