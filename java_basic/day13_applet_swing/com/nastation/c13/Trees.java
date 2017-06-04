package com.nastation.c13;

//: c13:Trees.java
//Simple Swing tree example. Trees can
//be made vastly more complex than this.
//<applet code=Trees
//width=250 height=250></applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;

//Takes an array of Strings and makes the first
//element a node and the rest leaves:
/**
 * 利用这个工具我们可取得一个字串数组 
 * 然后将其中的第一个字串作为根 
 * 剩下的字串作为叶
 */
class Branch {

	//是树数据结构中的通用节点
	DefaultMutableTreeNode r;

	public Branch(String[] data) {
		r = new DefaultMutableTreeNode(data[0]);
		for (int i = 1; i < data.length; i++) {
			r.add(new DefaultMutableTreeNode(data[i]));
		}
	}

	public DefaultMutableTreeNode node() {
		return r;
	}
}

public class Trees extends JApplet {
	
	String[][] data = { { "Colors", "Red", "Blue", "Green" },
			{ "Flavors", "Tart", "Sweet", "Bland" },
			{ "Length", "Short", "Medium", "Long" },
			{ "Volume", "High", "Medium", "Low" },
			{ "Temperature", "High", "Medium", "Low" },
			{ "Intensity", "High", "Medium", "Low" }, };

	static int i = 0;

	DefaultMutableTreeNode root, child, chosen;

	JTree tree;

	DefaultTreeModel model;

	public void init() {
		Container cp = getContentPane();
		root = new DefaultMutableTreeNode("root");
		tree = new JTree(root);
		
		// Add it and make it take care of scrolling:
		cp.add(new JScrollPane(tree), BorderLayout.CENTER);
		
		// Capture the tree's model:
		model = (DefaultTreeModel) tree.getModel();
		
		JButton test = new JButton("Press me");
		
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i < data.length) {
					child = new Branch(data[i]).node();
					i++;
					
					// What's the last one you clicked?
					chosen = (DefaultMutableTreeNode) tree
							.getLastSelectedPathComponent();
					if (chosen == null) {
						chosen = root;
					}
					
					// The model will create the
					// appropriate event. In response, the
					// tree will update itself:
					
					model.insertNodeInto(child, chosen, 0);
					// This puts the new node on the
					// currently chosen node.
				}
			}
		});
		
		// Change the button's colors:
		test.setBackground(Color.blue);
		test.setForeground(Color.white);
		
		JPanel p = new JPanel();
		p.add(test);
		cp.add(p, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Console.run(new Trees(), 250, 250);
	}
}