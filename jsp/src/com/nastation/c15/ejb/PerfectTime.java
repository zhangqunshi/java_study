package com.nastation.c15.ejb;

//# You must install the J2EE Java Enterprise
//# Edition from java.sun.com and add j2ee.jar
//# to your CLASSPATH in order to compile
//# this file. See details at java.sun.com.
//Remote Interface of PerfectTimeBean
import java.rmi.*;
import javax.ejb.*;

public interface PerfectTime extends EJBObject {
	public long getPerfectTime() throws RemoteException;
}