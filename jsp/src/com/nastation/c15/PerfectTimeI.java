package com.nastation.c15;

import java.rmi.*;

interface PerfectTimeI extends Remote {

	// 表示的是一个精确计时服务
	long getPerfectTime() throws RemoteException;
}
