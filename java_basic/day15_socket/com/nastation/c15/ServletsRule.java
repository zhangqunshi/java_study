package com.nastation.c15;

//: c15:servlets:ServletsRule.java
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletsRule extends HttpServlet {
	int i = 0; // Servlet "persistence"

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<HEAD><TITLE>");
		out.print("A server-side strategy");
		out.print("</TITLE></HEAD><BODY>");
		out.print("<h1>Servlets Rule! " + i++);
		out.print("</h1></BODY>");
		out.close();
	}
}