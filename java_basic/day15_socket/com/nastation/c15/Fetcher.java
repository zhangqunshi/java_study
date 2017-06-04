package com.nastation.c15;

//: c15:Fetcher.java
//<applet code=Fetcher width=500 height=300>
//</applet>
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.nastation.c13.Console;

public class Fetcher extends JApplet {
	
	JButton fetchIt = new JButton("Fetch the Data");

	JTextField f = new JTextField("Fetcher.java", 20);

	JTextArea t = new JTextArea(30, 50);

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		fetchIt.addActionListener(new FetchL());
		cp.add(new JScrollPane(t));
		cp.add(f);
		cp.add(fetchIt);
	}

	public class FetchL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				System.out.println("start");
				URL base = getDocumentBase();
				System.out.println(base);
				URL url = new URL(getDocumentBase(), f.getText());
//				URL url = new URL("file:/c:/a.c");
				t.setText(url + "\n");
				InputStream is = url.openStream();
				BufferedReader in = new BufferedReader(
						new InputStreamReader(is));
				String line;
				while ((line = in.readLine()) != null)
					t.append(line + "\n");
			} catch (Exception ex) {
				t.append(ex.toString());
			}
		}
	}

	public static void main(String[] args) {
		Console.run(new Fetcher(), 500, 300);
	}
}