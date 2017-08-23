package com.nastation.c15;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class PerfectTime extends UnicastRemoteObject implements PerfectTimeI {

	// Implementation of the interface:
	public long getPerfectTime() throws RemoteException {
		return System.currentTimeMillis();
	}

	// Must implement constructor
	// to throw RemoteException:
	public PerfectTime() throws RemoteException {
		// super(); // Called automatically
	}

	// Registration for RMI serving. Throw
	// exceptions out to the console.
	public static void main(String[] args) throws Exception {
	    //System.setSecurityManager(new RMISecurityManager());
		LocateRegistry.createRegistry(1099);
		PerfectTime pt = new PerfectTime();

		// Naming.bind("//zhangqs:2007/PerfectTime", pt);
		Naming.bind("//zhangqs/PerfectTime", pt);

		// Naming.bind("PerfectTime", pt);
		System.out.println("Ready to do time");
	}
}