package com.nastation.c15.ejb;

//Simple Stateless Session Bean
//that returns current system time.
import java.rmi.*;
import javax.ejb.*;

public class PerfectTimeBean implements SessionBean {
	private SessionContext sessionContext;

	// return current time
	public long getPerfectTime() {
		return System.currentTimeMillis();
	}

	// EJB methods
	public void ejbCreate() throws CreateException {
	}

	public void ejbRemove() {
	}

	public void ejbActivate() {
	}

	public void ejbPassivate() {
	}

	public void setSessionContext(SessionContext ctx) {
		sessionContext = ctx;
	}
}