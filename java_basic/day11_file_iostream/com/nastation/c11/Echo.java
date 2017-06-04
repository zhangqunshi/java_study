package com.nastation.c11;

//: c11:Echo.java
//How to read from standard input.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()).length() != 0)
            System.out.println(s);
        // An empty line terminates the program
    }
}