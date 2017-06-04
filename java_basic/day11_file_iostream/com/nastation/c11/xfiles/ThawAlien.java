package com.nastation.c11.xfiles;

//: c11:xfiles:ThawAlien.java
//Try to recover a serialized file without the
//class of object that's stored in that file.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ThawAlien {
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\X.file"));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
        in.close();
    }
}