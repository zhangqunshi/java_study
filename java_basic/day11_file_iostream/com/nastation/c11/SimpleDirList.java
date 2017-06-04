package com.nastation.c11;

//: c11:DirList.java
// Displays directory listing.

import java.io.File;

public class SimpleDirList {
    public static void main(String[] args) {
        //File path = new File(".");
        File path = new File("c:\\\\");
        String[] list = path.list();

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}