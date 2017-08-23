package com.nastation.c15.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class TestHello {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		IHelloWorld t = (IHelloWorld) Naming.lookup("//zhangqs/Hello");
		
		System.out.println(t.say());
	}

}
