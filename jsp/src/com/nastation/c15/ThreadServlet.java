package com.nastation.c15;

//: c15:servlets:ThreadServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ThreadServlet extends HttpServlet {
	int i;

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		synchronized (this) {
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
		}
		out.print("<h1>Finished " + i++ + "</h1>");
		out.close();
	}
}