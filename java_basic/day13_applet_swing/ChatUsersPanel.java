import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ChatUsersPanel extends JPanel {
	
	JList users;
	
	ChatUsersPanel() {
		setLayout(new BorderLayout());
		
		String[] data = {"在线的活动人员列表    "};
		users = new JList(data);
		
		add(new JScrollPane(users));
	}

}
