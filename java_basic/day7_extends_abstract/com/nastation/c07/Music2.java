package com.nastation.c07;

class Note2 {
    private int value;

    private Note2(int val) {
        value = val;
    }

    public static final Note2
            MIDDLE_C = new Note2(0),
            C_SHARP = new Note2(1),
            B_FLAT = new Note2(2);
}

class Instrument2 {
    public void play(Note2 n) {
        System.out.println("Instrument.play()");
    }
}

class Wind2 extends Instrument2 {
    public void play(Note2 n) {
        System.out.println("Wind.play()");
    }
}

class Stringed extends Instrument2 {
    public void play(Note2 n) {
        System.out.println("Stringed.play()");
    }
}

class Brass extends Instrument2 {
    public void play(Note2 n) {
        System.out.println("Brass.play()");
    }
}

public class Music2 {
    public static void tune(Wind2 i) {
        i.play(Note2.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note2.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note2.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind2 flute = new Wind2();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
}