package com.nastation.c12;

import java.lang.reflect.Field;


//: c12:SweetShop.java
//Examination of the way the class loader works.
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    double i = Math.random();

    Gum() {
        System.out.println("Gum Contructor!");
    }

    static {
        System.out.println("Loading Gum");
    }

    public void print() {
        System.out.println("This is Gum!");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
//			Class.forName("com.nastation.c12.Gum");

            Class c = Class.forName("com.nastation.c12.Gum");
            Field ms = c.getDeclaredField("i");
            Gum gum = new Gum();
            double o = ms.getDouble(gum);
            System.out.println("gum.i = " + o);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}