package com.nastation.c11;

//: c11:TestEOF.java
//Testing for the end of file
//while reading a byte at a time.

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
    // Throw exceptions to console:
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("c:\\drivez.log")));
        while (in.available() != 0) {
            System.out.print((char) in.readByte());
        }
    }
}