package com.nastation.c15;

//: c15:jdbc:VLookup.java
//GUI version of Lookup.java.
//<applet code=VLookup
//width=500 height=200></applet>
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

import com.nastation.c13.Console;

import java.sql.*;

public class VLookup extends JApplet {
	
	String dbUrl = "jdbc:mysql://localhost/test";
	String user = "root";
	String password = "123456";

	Statement s;

	JTextField searchFor = new JTextField(20);

	JLabel completion = new JLabel(" ");

	JTextArea results = new JTextArea(40, 20);

	public void init() {
		searchFor.getDocument().addDocumentListener(new SearchL());
		JPanel p = new JPanel();
		p.add(new Label("Last name to search for:"));
		p.add(searchFor);
		p.add(completion);
		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);
		cp.add(results, BorderLayout.CENTER);
		try {
			// Load the driver (registers itself)
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection(dbUrl, user, password);
			s = c.createStatement();
		} catch (Exception e) {
			results.setText(e.toString());
		}
	}

	class SearchL implements DocumentListener {
		public void changedUpdate(DocumentEvent e) {
		}

		public void insertUpdate(DocumentEvent e) {
			textValueChanged();
		}

		public void removeUpdate(DocumentEvent e) {
			textValueChanged();
		}
	}

	public void textValueChanged() {
		ResultSet r;
		if (searchFor.getText().length() == 0) {
			completion.setText("");
			results.setText("");
			return;
		}
		try {
			// Name completion:
			r = s.executeQuery("SELECT LAST FROM people "
					+ "WHERE (LAST Like '" + searchFor.getText()
					+ "%') ORDER BY LAST");
			if (r.next())
				completion.setText(r.getString("last"));
			r = s.executeQuery("SELECT FIRST, LAST, EMAIL "
					+ "FROM people " + "WHERE (LAST='"
					+ completion.getText() + "') AND (EMAIL Is Not Null) "
					+ "ORDER BY FIRST");
		} catch (Exception e) {
			results.setText(searchFor.getText() + "\n");
			results.append(e.toString());
			return;
		}
		results.setText("");
		try {
			while (r.next()) {
				results.append(r.getString("LAST") + ", "
						+ r.getString("FIRST") + ": " + r.getString("EMAIL")
						+ "\n");
			}
		} catch (Exception e) {
			results.setText(e.toString());
		}
	}

	public static void main(String[] args) {
		Console.run(new VLookup(), 500, 200);
	}
}