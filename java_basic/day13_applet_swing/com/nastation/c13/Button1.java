package com.nastation.c13;

//: c13:Button1.java
//Putting buttons on an applet.
//<applet code=Button1 width=200 height=50>
//</applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1 extends JApplet {

    JButton b1 = new JButton("Button 1");
    JButton b2;
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");
    JButton b6 = new JButton("Button 6");
    JButton b7 = new JButton("Button 7");
    JButton b8 = new JButton("Button 8");
    JButton b9 = new JButton("Button 9");

    public void init() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
//        b1.addActionListener(new HelloL());
        cp.add(b1);
        
        b2 = new JButton("Button 2");
        cp.add(b2);
        cp.add(b3);
        cp.add(b4);
        cp.add(b5);
        cp.add(b6);
        cp.add(b7);
        cp.add(b8);
        cp.add(b9);
    	
//    	setLayout(new FlowLayout());
//    	add(b1);

    }

//    public static void main(String[] args) {
//        Console.run(new Button1(), 200, 50);
//    }
}

//class HelloL implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//		System.out.println("Hello, Kris");
//	}
//	
//}