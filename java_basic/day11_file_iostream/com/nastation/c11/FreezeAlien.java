package com.nastation.c11;

//: c11:FreezeAlien.java
//Create a serialized output file.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezeAlien {
    // Throw exceptions to console:
    public static void main(String[] args) throws IOException {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("c:\\X.file"));
        Alien zorcon = new Alien();
        out.writeObject(zorcon);
        out.close();
    }
}