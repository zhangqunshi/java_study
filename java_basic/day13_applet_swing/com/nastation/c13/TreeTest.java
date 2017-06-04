package com.nastation.c13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class TreeTest extends JFrame {

	JButton b = new JButton("Press me");
	MutableTreeNode root;
	DefaultTreeModel model;
	JTree tree;
	static int count = 0;

	String[][] data = { { "Colors", "Red", "Blue", "Green" },
			{ "Flavors", "Tart", "Sweet", "Bland" },
			{ "Length", "Short", "Medium", "Long" },
			{ "Volume", "High", "Medium", "Low" },
			{ "Temperature", "High", "Medium", "Low" },
			{ "Intensity", "High", "Medium", "Low" }, };

	TreeTest() {
		root = createNode("root");
		tree = new JTree(root);
		model = (DefaultTreeModel) tree.getModel();

		b.setForeground(Color.GREEN);
		b.setBackground(Color.YELLOW);
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				MutableTreeNode chosen = (MutableTreeNode) tree
						.getLastSelectedPathComponent();
				if (chosen == null) {
					chosen = root;
				}
				if (count < data.length) {
					MutableTreeNode child = branch(data[count++]);
					model.insertNodeInto(child, chosen, 0);
				}
			}
		});

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(tree);
		c.add(b, BorderLayout.SOUTH);

	}

	MutableTreeNode createNode(String s) {
		return new DefaultMutableTreeNode(s);
	}

	MutableTreeNode branch(String[] s) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(s[0]);
		for (int i = 1; i < s.length; i++) {
			node.add(new DefaultMutableTreeNode(s[i]));
		}
		return node;
	}

	public static void main(String[] args) {
		TreeTest frame = new TreeTest();
		frame.setSize(200, 100);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
