package com.nastation.c07;

class DoBaseFinalization {
    public static boolean flag = false;
}

/**
 * 无论是否调用了基类收尾模块Characteristic 成员对象都肯定会得到收尾清除处理
 *
 * @author kris
 */

class Characteristic {
    String s;

    Characteristic(String c) {
        s = c;
        System.out.println("Creating Characteristic " + s);
    }

    protected void finalize() {
        System.out.println("finalizing Characteristic " + s);
    }
}

class LivingCreature {
    Characteristic p = new Characteristic("is alive");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    //3
    protected void finalize() throws Throwable {
        System.out.println("LivingCreature finalize");
        // Call base-class version LAST!
        if (DoBaseFinalization.flag)
            super.finalize();
    }
}

class Animal extends LivingCreature {
    Characteristic p = new Characteristic("has heart");

    Animal() {
        System.out.println("Animal()");
    }

    //2
    protected void finalize() throws Throwable {
        System.out.println("Animal finalize");
        if (DoBaseFinalization.flag)
            super.finalize();
    }
}

class Amphibian extends Animal {
    Characteristic p = new Characteristic("can live in water");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    //1
    protected void finalize() throws Throwable {
        System.out.println("Amphibian finalize");
        if (DoBaseFinalization.flag)
            super.finalize();
    }
}

/**
 * 没有为Frog 的基类调用收尾模块, 但成员对象确实进行了收尾
 * 首先执行对派生类的收尾再是基类的收尾
 *
 * @author kris
 */
public class Frog extends Amphibian {
    Frog() {
        System.out.println("Frog()");
    }

    //4
    protected void finalize() throws Throwable {
        System.out.println("Frog finalize");
        if (DoBaseFinalization.flag)
            super.finalize();
    }

    public static void main(String[] args) {
        if (args.length != 0 && args[0].equals("finalize"))
            DoBaseFinalization.flag = true;
        else
            System.out.println("Not finalizing bases");
        new Frog(); // Instantly becomes garbage
        System.out.println("Bye!");
        // Force finalizers to be called:
        System.gc();
    }
}