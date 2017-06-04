package com.nastation.c07;

/**
 * 扩展性
 *
 * @author kris
 */
class Instrument3 {
    public void play() {
        System.out.println("Instrument.play()");
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
    }
}

class Wind3 extends Instrument3 {
    public void play() {
        System.out.println("Wind.play()");
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
    }
}

class Percussion extends Instrument3 {
    public void play() {
        System.out.println("Percussion.play()");
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
    }
}

class Stringed3 extends Instrument3 {
    public void play() {
        System.out.println("Stringed.play()");
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
    }
}

class Brass3 extends Wind3 {
    public void play() {
        System.out.println("Brass.play()");
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind3 {
    public void play() {
        System.out.println("Woodwind.play()");
    }

    public String what() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument3 i) {
        // ...
        i.play();
    }

    static void tuneAll(Instrument3[] e) {
        for (int i = 0; i < e.length; i++)
            tune(e[i]);
    }

    public static void main(String[] args) {
        Instrument3[] orchestra = new Instrument3[5];
        int i = 0;
        // Upcasting during addition to the array:
        orchestra[i++] = new Wind3();
        orchestra[i++] = new Percussion();
        orchestra[i++] = new Stringed3();
        orchestra[i++] = new Brass3();
        orchestra[i++] = new Woodwind();
        tuneAll(orchestra);
    }
}