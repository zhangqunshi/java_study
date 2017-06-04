package com.nastation.c19;

import java.io.IOException;
import java.io.InputStream;

public class UsingProcessBuilder2 {

	public static void main(String[] args) {
		try {
			Process p = new ProcessBuilder("ping", "58.116.170.142").start();
			InputStream in = p.getInputStream();
			
			StringBuffer sb = new StringBuffer();
			int readbytes = -1;
			byte[] b = new byte[1024];
			try {
				while ((readbytes = in.read(b)) != -1) {
					sb.append(new String(b, 0, readbytes));
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
			System.out.println("ping result: \n" + sb);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
