package com.nastation.c09;

import java.util.ArrayList;
import java.util.Iterator;

public class CatsAndDogs2 {

    public static void main(String[] args) {

        ArrayList cats = new ArrayList();

        for (int i = 0; i < 7; i++) {
            cats.add(new Cat(i));
        }

        Iterator e = cats.iterator();
        while (e.hasNext()) {
            ((Cat) e.next()).print();
        }
    }
}