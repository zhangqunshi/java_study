package com.nastation.c07;

//: c07:RTTI.java
//Downcasting & Run-time Type
//Identification (RTTI).

/**
 * 向下强制转型与运行时间类型标识
 */
class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    public void f() {
    }

    public void g() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        // Compile-time: method not found in Useful:
        // ! x[1].u();
        ((MoreUseful) x[1]).u(); // Downcast/RTTI
        ((MoreUseful) x[0]).f(); // Exception thrown
    }
}