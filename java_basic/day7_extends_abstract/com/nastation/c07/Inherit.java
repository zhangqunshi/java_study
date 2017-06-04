package com.nastation.c07;

abstract class A {
    int a = 1;

    A() {
        System.out.println("A");
        draw();
    }

    abstract void draw();
}

class B extends A {
    int a = 2;

    B() {
        System.out.println("B");
    }

    void draw() {
        System.out.println("a=" + a);
    }
}


class Inherit {
    public static void main(String[] args) {
        //A b = new B();
        new B();
        //System.out.println(b.a);
    }
}
