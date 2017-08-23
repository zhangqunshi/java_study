package com.nastation.c15.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloWorld extends Remote {
	
	String say() throws RemoteException;

}
