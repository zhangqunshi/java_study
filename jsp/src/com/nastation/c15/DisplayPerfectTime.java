package com.nastation.c15;

import java.rmi.*;
import java.rmi.registry.*;

public class DisplayPerfectTime {
	
	public static void main(String[] args) throws Exception {
//		System.setSecurityManager(new RMISecurityManager());
		
//		PerfectTimeI t = (PerfectTimeI) Naming.lookup("//zhangqs:2007/PerfectTime");
		PerfectTimeI t = (PerfectTimeI) Naming.lookup("//zhangqs/PerfectTime");
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(100);
			System.out.println("Perfect time = " + t.getPerfectTime());
		}
	}
}