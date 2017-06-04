package com.nastation.c09;

import java.util.HashMap;

public class StringHashCode {
    public static void main(String[] args) {

        System.out.println("Hello".hashCode());
        System.out.println("Hello".hashCode());

        MyHash a = new MyHash();
        MyHash b = new MyHash();
        MyHash c = new MyHash();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        HashMap hm = new HashMap();
        hm.put(a, "kris1");
        hm.put(b, "kris2");
        hm.put(c, "kris3");
        System.out.println(hm.get(a));
        System.out.println(hm.get(b));
        System.out.println(hm);
    }

    static class MyHash {
        int i;

        @Override
        public int hashCode() {
            return i;
        }

        public boolean equals(Object obj) {
            MyHash mh = (MyHash) obj;
            return this.i == mh.i;
        }

    }
}