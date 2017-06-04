package com.nastation.c09;

import java.util.ArrayList;

public class CatsAndDogs {

    public static void main(String[] args) {

        ArrayList cats = new ArrayList();
        for (int i = 0; i < 7; i++) {
            cats.add(new Cat(i));
        }

        // Not a problem to add a dog to cats:
        cats.add(new Dog(7));

        for (int i = 0; i < cats.size(); i++) {
            ((Cat) cats.get(i)).print();
        }
//		((Dog)cats.get(7)).print();
        // Dog is detected only at run-time
    }
}