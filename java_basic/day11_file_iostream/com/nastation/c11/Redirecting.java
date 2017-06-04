package com.nastation.c11;

//: c11:Redirecting.java
//Demonstrates standard I/O redirection.

import java.io.*;

class Redirecting {
    // Throw exceptions to console:
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(
                "c:\\a.txt"));
        PrintStream out = new PrintStream(new BufferedOutputStream(
                new FileOutputStream("test.txt")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close(); // Remember this!
        br.close();
        in.close();
    }
}