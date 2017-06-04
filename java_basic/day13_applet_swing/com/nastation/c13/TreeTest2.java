package com.nastation.c13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class TreeTest2 extends JApplet {
	
	JTree tree;
	DefaultTreeModel model;
	DefaultMutableTreeNode root;
	
	public void init() {
		root = new DefaultMutableTreeNode("root");
		
		tree = new JTree(root);
		model = (DefaultTreeModel)tree.getModel();
		
		JButton b = new JButton("Add node");
		b.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae) {
				MutableTreeNode chosen = 
					(MutableTreeNode)tree.getLastSelectedPathComponent();
				if (chosen != null) {
					MutableTreeNode node = new DefaultMutableTreeNode("kris");
					model.insertNodeInto(node, chosen, 0);
				}
				
			}
			
		});
		
		add(tree);
		add(b, BorderLayout.SOUTH);
				
	}

}
