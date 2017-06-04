import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;


public class Chatroom extends JFrame {
	
	Chatroom() {
		setTitle("Chatroom");
		setLayout(new BorderLayout());
		
		ChatWordsPanel cwp = new ChatWordsPanel();
		ChatUsersPanel cup = new ChatUsersPanel();
		ChatSendPanel csp = new ChatSendPanel(cwp);
		
		cwp.setBorder(new TitledBorder("��������"));
		cup.setBorder(new TitledBorder("��Ա�б�"));
		csp.setBorder(new TitledBorder("��������"));
		
		
		add(cwp, BorderLayout.CENTER);
		add(cup, BorderLayout.EAST);
		add(csp, BorderLayout.SOUTH);		
	}
	
	public static void main(String[] args) {
		Chatroom cr = new Chatroom();
		cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cr.setVisible(true);
		cr.setSize(600, 500);
	}

}
