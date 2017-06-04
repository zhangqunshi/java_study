/*
 * ButtonTest.java
 *
 * Created on 2007-11-13, 10:18:45
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nastation.c13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * No any useful, only for test.
 * @author Kris
 */
public class ButtonTest extends JApplet {

    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JTextField tf = new JTextField(10);

    class BL implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("BL1");
            String s = ((JButton) e.getSource()).getText();
            tf.setText("1:" + s);
        }
    }

    class BL2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("BL2");
            String s = ((JButton) e.getSource()).getText();
            tf.setText("2:" + s);
        }
    }
    BL bl = new BL();
    BL2 bl2 = new BL2();

    public void init() {
        b1.addActionListener(bl);
        b1.addActionListener(bl2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tf.setText("Hello,Kris");
            }
        });
        b1.setText("Hello");
        b2.setText("Kris2");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(b1);
        c.add(b2);

        c.add(tf);
    }
}