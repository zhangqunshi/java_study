package com.nastation.c11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reading data from a file
 */
public class IOStreamDemo2 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("bbb.txt"));
        String s, s2 = new String();
        while ((s = in.readLine()) != null) {
            s2 += s + "\n";
        }
        in.close();
        System.out.println(s2);
    }
}