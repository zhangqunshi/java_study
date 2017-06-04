package com.nastation.c05;

import com.nastation.c05.test.SimplePackage;

public class SimpleImport {

    SimplePackage s;

    SimpleImport() {
        s = new SimplePackage();
        s.printHello();
    }

    public static void main(String[] args) {
        new SimpleImport();
    }
}

