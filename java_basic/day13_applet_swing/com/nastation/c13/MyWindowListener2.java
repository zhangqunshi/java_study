package com.nastation.c13;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowListener2 extends WindowAdapter {
	
	public void windowsClosing(WindowEvent e) {
		System.out.println("hello");
		System.exit(0);
	}
}