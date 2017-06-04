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
		
		cwp.setBorder(new TitledBorder("聊天内容"));
		cup.setBorder(new TitledBorder("人员列表"));
		csp.setBorder(new TitledBorder("发送内容"));
		
		
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
