package com.nastation.c13;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class MyWindowListener implements WindowListener {
class MyWindowListener extends WindowAdapter {

//	public void windowActivated(WindowEvent arg0) {
//		System.out.println("windowActivated this");
//
//	}
//
//	public void windowClosed(WindowEvent arg0) {
//		System.out.println("windowClosed this");
//
//	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing this");
		 System.exit(0);

	}
//
//	public void windowDeactivated(WindowEvent arg0) {
//		System.out.println("windowDeactivated this");
//
//	}
//
//	public void windowDeiconified(WindowEvent arg0) {
//		System.out.println("windowDeiconified this");
//
//	}
//
//	public void windowIconified(WindowEvent arg0) {
//		System.out.println("windowIconified this");
//
//	}
//
//	public void windowOpened(WindowEvent arg0) {
//		System.out.println("windowOpened this");
//
//	}
}
