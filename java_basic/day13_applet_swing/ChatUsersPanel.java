import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ChatUsersPanel extends JPanel {
	
	JList users;
	
	ChatUsersPanel() {
		setLayout(new BorderLayout());
		
		String[] data = {"���ߵĻ��Ա�б�    "};
		users = new JList(data);
		
		add(new JScrollPane(users));
	}

}
