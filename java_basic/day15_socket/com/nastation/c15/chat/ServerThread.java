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
 * ���ܿͻ�����Ϣ��Ȼ����ʾ�ڿ���̨��
 * 
 * @version v0.1 2007-11-28
 * @author Kris
 */
public class ServerThread implements ServerWork {

	public final static String END = "END";

	/** ��ͻ���ÿ�ν��������� */
	private Socket socket;

	/** ���Կͻ��˵������� */
	private BufferedReader in;
	
	/** �û��б� */
	static List clientUsers = Collections.synchronizedList(new ArrayList());

	/** ָ��ͻ��˵������ */
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
	 * ���ܿͻ���������Ϣ������ʾ�ڿ���̨��
	 */
	public void run() {
		while (true) {
			String msg = null;
			try {
				msg = in.readLine();
				if (msg != null) {
					System.out.println("DEBUG--->" + msg);
					
					if (msg.equals("START")) {
						
						//�ȸ����û���ǰ���ߵ��û�
						
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
	 * �ر���Դ
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
