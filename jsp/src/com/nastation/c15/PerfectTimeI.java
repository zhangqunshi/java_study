package com.nastation.c15;

import java.rmi.*;

interface PerfectTimeI extends Remote {

	// ��ʾ����һ����ȷ��ʱ����
	long getPerfectTime() throws RemoteException;
}
