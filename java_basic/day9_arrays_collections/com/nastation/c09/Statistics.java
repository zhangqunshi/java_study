package com.nastation.c09;

//: c09:Statistics.java
//Simple demonstration of HashMap.

import java.util.HashMap;

class Counter {
    int i = 1;

    public String toString() {
        return Integer.toString(i);
    }
}

class Statistics {

    public static void main(String[] args) {
        HashMap hm = new HashMap();

        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            Integer r = new Integer((int) (Math.random() * 20));
            if (hm.containsKey(r)) {
                ((Counter) hm.get(r)).i++;
            } else {
                hm.put(r, new Counter());
            }
        }
        System.out.println(hm);
    }
}