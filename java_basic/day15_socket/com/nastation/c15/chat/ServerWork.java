package com.nastation.c15.chat;

import java.io.IOException;
import java.net.Socket;

/**
 * ����������Ϳͻ��˽����ľ���ҵ�����̡�
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public interface ServerWork extends Runnable {
	
	void init(Socket s, User user) throws IOException;

}
