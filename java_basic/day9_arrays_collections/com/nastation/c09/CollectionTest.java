package com.nastation.c09;

import java.util.ArrayList;

public class CollectionTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add("1");
        a.add("2");

        ArrayList b = new ArrayList();
        b.add("3");
        b.add("4");

        // addAll
        a.addAll(b);
        System.out.println(a);
        System.out.println(b);

        // clear
        b.clear();
        System.out.println("b = " + b);

        // contain
        System.out.println(a.contains("3"));
        System.out.println(a.contains("5"));

        // contains all
        System.out.println(a.containsAll(b));
        b.add("1");
        System.out.println(a.containsAll(b));
        b.add("aa");
        System.out.println(a.containsAll(b));
        a.add("aa");
        System.out.println(a.containsAll(b));

        System.out.println(a);
        System.out.println(b);
        System.out.println(b.containsAll(a));

        // isEmpty
        System.out.println(a.isEmpty());
        b.clear();
        System.out.println(b.isEmpty());

        // remove
        a.add("5");
        a.add("aa");
        System.out.println(a);
        a.remove("aa");
        System.out.println(a);

        // removeAll
        System.out.println();
        a.add("aa");
        b.add("aa");
        System.out.println(a);
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);
        System.out.println(b);

        // size
        System.out.println(a.size());
        System.out.println(b.size());

        // toArray
        Object[] obj = a.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]);
        }

        // toArray(Object[])
        System.out.println();
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        String[] x = new String[3];
//		a.add(new Integer(7));
        x[0] = "20";
//		x[6] = "21";
        String[] x2 = (String[]) a.toArray(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
//		System.out.println("x2===" + x2);
        System.out.println();
        for (int i = 0; i < x2.length; i++) {
            System.out.print(x2[i] + " ");
        }

        // retainAll
        System.out.println();
        System.out.println();
        b.add("1");
        a.retainAll(b);
        System.out.println(a);

    }

}
