package com.nastation.c15.ejb;

//: c15:ejb:PerfectTimeHome.java
//Home Interface of PerfectTimeBean.
import java.rmi.*;
import javax.ejb.*;

public interface PerfectTimeHome extends EJBHome {
	public PerfectTime create() throws CreateException, RemoteException;
}