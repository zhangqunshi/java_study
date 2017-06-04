package com.nastation.c11;

class Computer {
    static int cpu = 486;
}

class NoteBook extends Computer {

    static int cpu = 586;

    public static void main(String[] args) {
        Computer c = new NoteBook();
        System.out.println(c.cpu);
        c.cpu = 686;
        Computer c2 = new Computer();
        System.out.println(c2.cpu);
        NoteBook nb = new NoteBook();
        System.out.println(nb.cpu);
        nb.cpu = 686;
        NoteBook nb2 = new NoteBook();
        System.out.println(nb2.cpu);
    }
}
