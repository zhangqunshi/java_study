package com.nastation.c07;

/**
 * 返回值不一样
 *
 * @author kris
 */
class Animal {
    void play() {
        System.out.println("InstrumentX.play()");
    }
}

class Cat extends Animal {
    int play() {
        System.out.println("WindX.play(NoteX n)");
        return 0;
    }
}

public class WindError2 {
    public static void tune(Animal a) {
        // ...
        a.play();
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        tune(a);
    }
}
