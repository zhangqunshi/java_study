import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ChatSendPanel extends JPanel {

	JTextField editPane;
	JButton sendButton;
	ChatWordsPanel cwp;

	ChatSendPanel(ChatWordsPanel cwp) {
		this.cwp = cwp;
		setLayout(new BorderLayout());

		editPane = new JTextField();
		sendButton = new JButton("Send");
		editPane.addActionListener(new SendAction());
		sendButton.addActionListener(new SendAction());

		add(editPane);
		add(sendButton, BorderLayout.EAST);
	}

	class SendAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			cwp.addWords(editPane.getText());
			editPane.setText("");
		}

	}
}
