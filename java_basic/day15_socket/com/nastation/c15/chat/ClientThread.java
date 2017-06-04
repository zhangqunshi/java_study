package com.nastation.c15.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientThread {

	ClientThread() throws IOException {
		InetAddress addr = InetAddress.getByName(null);

		System.out.println("addr = " + addr);
		Socket socket = new Socket(addr, ServerMain.DEFAULT_PORT);

		try {
			System.out.println("socket = " + socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));

			PrintWriter out = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())), true);

			System.out.print("sending message...");
			out.println("START");

			// 获得用户列表
			while (true) {
				String user = in.readLine();
				System.out.println(user);
				if (user == null || user.equals("END")) {
					break;
				}
			}
			System.out.println("DEBUG-->END");

			out.println("END");
			System.out.println("end");
		} finally {
			System.out.print("closing...");
			socket.close();
			System.out.println("done");
		}
	}

	public static void main(String[] args) throws IOException {
		new ClientThread();
	}

}
