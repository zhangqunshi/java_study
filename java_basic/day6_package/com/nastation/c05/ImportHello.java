package com.nastation.c05;

public class ImportHello {

    public ImportHello() {
        Hello hw = new Hello();
        hw.print();
    }

    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }


    void sayHello2Kris() {
        sayHello("kris");
    }

    public static void main(String[] args) {
        new ImportHello().sayHello2Kris();
    }


}