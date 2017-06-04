//package com.nastation.c11;

//: c11:Redirecting.java
//Demonstrates standard I/O redirection.

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Redirecting2 {
    // Throw exceptions to console:
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(InputStreamReader(System.in));
        PrintStream out = new PrintStream(new BufferedOutputStream(
                new FileOutputStream("c:\\a.txt")));
        //System.setIn(in);
        System.setOut(out);
        //System.setErr(out);

        System.out.println("hello, world");
        out.close();

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = br.readLine()) != null)
			System.out.println(s);
		out.close(); // Remember this!
		br.close();
		in.close();
		*/
    }
}