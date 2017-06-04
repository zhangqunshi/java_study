package com.nastation.c15.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 聊天室的服务器端
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public class ServerMain extends Thread {
	
	public final static int DEFAULT_PORT = 8000;

	private ServerSocket s;

	/** 代表服务器端和客户端具体交互的内容 */
	private ServerWork work;
	
	private boolean stop = false;

	/**
	 * Constructor
	 * 
	 * @param port
	 * @throws IOException
	 */
	ServerMain(int port, ServerWork work) throws IOException {
		if (port != 0) {
			s = new ServerSocket(port);
		} else {
			s = new ServerSocket(DEFAULT_PORT);
		}
		this.work = work;
	}

	ServerMain(ServerWork work) throws IOException {
		this(0, work);
	}

	public void run() {
		while (true) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (stop == true) {
				break;
			} else {
				try {
					Socket socket = s.accept();
					System.out.println("A new client connected: " + socket);
					User user = new User(socket.getRemoteSocketAddress().toString());
					work.init(socket, user);
					new Thread(work).start();
				} catch (Exception ex) {
					stop = true;
					ex.printStackTrace();
					try {
						System.out.println("Try to close the socket...");
						s.close();
					} catch (IOException e) {
						System.err.println("ERROR: Socket cannnot close!");
					}
				}
			}
		}
		System.out.println("Server Stop");
	}
	
	/**
	 * Stop this server side work.
	 */
	public void stopIt() {
		this.stop = true;
	}

	/**
	 * 测试函数
	 * 
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Server Start");
		ServerMain main = new ServerMain(new ServerThread());
		main.start();
//		sleep(1000);
//		main.stopIt();
	}

}
