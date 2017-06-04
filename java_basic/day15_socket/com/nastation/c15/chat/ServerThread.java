package com.nastation.c15.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 接受客户端信息，然后显示在控制台上
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public class ServerThread implements ServerWork {

	public final static String END = "END";

	/** 与客户端每次建立的连接 */
	private Socket socket;

	/** 来自客户端的输入流 */
	private BufferedReader in;
	
	/** 用户列表 */
	static List clientUsers = Collections.synchronizedList(new ArrayList());

	/** 指向客户端的输出流 */
	private PrintWriter out;
	
	
	/**
	 * init
	 */
	public void init(Socket s, User user) throws IOException {
		socket = s;
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(s.getOutputStream())));
		clientUsers.add(user);
	}
	
	
	/**
	 * 接受客户端来的信息，并显示在控制台上
	 */
	public void run() {
		while (true) {
			String msg = null;
			try {
				msg = in.readLine();
				if (msg != null) {
					System.out.println("DEBUG--->" + msg);
					
					if (msg.equals("START")) {
						
						//先告诉用户当前在线的用户
						
						StringBuffer sb = new StringBuffer("Online: " + clientUsers.size() + "\n");
						for (int i = 0; i < clientUsers.size(); i++) {
							sb.append(clientUsers.get(i)).append("\n");
						}
						System.out.println("DEBUG--->" + sb);
						out.println(sb);
						out.flush();
						
						out.println("END");
						out.flush();
						
					} else if (msg.equals(END)) {
						break;
					} else {
						System.out.println("MSG from "
								+ socket.getRemoteSocketAddress() + " -> "
								+ msg);
					}
				}
				
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
				close();
			} 
		}
		close();
	}

	/**
	 * 关闭资源
	 */
	public void close() {
		System.out.println("A connection closed :" + socket);
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
