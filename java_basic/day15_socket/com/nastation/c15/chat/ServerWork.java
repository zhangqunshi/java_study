package com.nastation.c15.chat;

import java.io.IOException;
import java.net.Socket;

/**
 * 定义服务器和客户端交互的具体业务流程。
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public interface ServerWork extends Runnable {
	
	void init(Socket s, User user) throws IOException;

}
