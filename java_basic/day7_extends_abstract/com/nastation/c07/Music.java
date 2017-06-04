package com.nastation.c07;

/**
 * 向上强制转型
 * final有效地关闭动态绑定或者告诉编译器不需要进行动态绑定
 *
 * @author kris
 */
class Note {
    private int value;

    private Note(int val) {
        value = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Note other = (Note) obj;
        if (value != other.value)
            return false;
        return true;
    }

    public static final Note MIDDLE_C = new Note(0);
    public static final Note C_SHARP = new Note(1);
    public static final Note B_FLAT = new Note(2);
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {

        if (n.equals(Note.MIDDLE_C)) {
            System.out.println("Wind.play(middle)");
        } else if (n.equals(Note.B_FLAT)) {
            System.out.println("Wind.play(flat)");
        } else if (n.equals(Note.C_SHARP)) {
            System.out.println("Wind.play(sharp)");
        } else {
            System.out.println("Wind.play()");
        }
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind a = new Wind();
        tune(a); // Upcasting
    }
}
