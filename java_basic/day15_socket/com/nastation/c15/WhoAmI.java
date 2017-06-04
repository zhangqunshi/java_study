package com.nastation.c15;

//: c15:WhoAmI.java
//Finds out your network address when
//you're connected to the Internet.
import java.net.*;

public class WhoAmI {
	
	public static void main(String[] args) throws Exception {
		
		if (args.length != 1) {
			System.err.println("Usage: WhoAmI MachineName");
			System.exit(1);
		}
		
//		InetAddress a = InetAddress.getByName(args[0]);
//		InetAddress a = InetAddress.getByName(null);
//		InetAddress a = InetAddress.getByName("localhost");
		InetAddress a = InetAddress.getByName("M-63");
		System.out.println(a);
	}
}