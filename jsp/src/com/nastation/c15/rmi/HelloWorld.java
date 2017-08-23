package com.nastation.c15.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorld extends UnicastRemoteObject implements IHelloWorld {

	@Override
	public String say() throws RemoteException {
		return "Hello, world";
	}

	public HelloWorld() throws RemoteException {
	}
	
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
//		LocateRegistry.createRegistry(1099);
		HelloWorld hw = new HelloWorld();
		
		Naming.bind("//zhangqs/Hello", hw);
		
		System.out.println("Hello Service Ready!");
	}

}
