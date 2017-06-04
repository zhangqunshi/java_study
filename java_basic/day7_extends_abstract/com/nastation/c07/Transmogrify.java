package com.nastation.c07;

//: c07:Transmogrify.java
//Dynamically changing the behavior of
//an object via composition.


abstract class Actor {
    abstract void act();
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    Actor a = new HappyActor();

    void change() {
        a = new SadActor();
    }

    void go() {
        a.act();
    }
}

/**
 * 我们在运行时间就获得了很大的灵活性, 也把它叫作状态范式
 *
 * @author kris
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.go(); // Prints "HappyActor"
        s.change();
        s.go(); // Prints "SadActor"
    }
}