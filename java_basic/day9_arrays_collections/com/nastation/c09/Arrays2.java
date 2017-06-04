package com.nastation.c09;

import java.util.Random;

public class Arrays2 {
    private static void start(int from, int to, int length) {
        if (from != 0 || to != length)
            System.out.print("[" + from + ":" + to + "] ");
        System.out.print("(");
    }

    private static void end() {
        System.out.println(")");
    }

    public static void print(Object[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, Object[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(Object[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(boolean[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, boolean[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(boolean[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(byte[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, byte[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(byte[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(char[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, char[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(char[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(short[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, short[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(short[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(int[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, int[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(int[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(long[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, long[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(long[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(float[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, float[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(float[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    public static void print(double[] a) {
        print(a, 0, a.length);
    }

    public static void print(String msg, double[] a) {
        System.out.print(msg + " ");
        print(a, 0, a.length);
    }

    public static void print(double[] a, int from, int to) {
        start(from, to, a.length);
        for (int i = from; i < to; i++) {
            System.out.print(a[i]);
            if (i < to - 1)
                System.out.print(", ");
        }
        end();
    }

    // Fill an array using a generator:
    public static void fill(Object[] a, Generator gen) {
        fill(a, 0, a.length, gen);
    }

    public static void fill(Object[] a, int from, int to, Generator gen) {
        for (int i = from; i < to; i++)
            a[i] = gen.next();
    }

    //
    static String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz";

    static char[] src = ssource.toCharArray();

    private static Random r = new Random();

    public static class RandCharGenerator implements CharGenerator {
        public char next() {
            int pos = Math.abs(r.nextInt());
            return src[pos % src.length];
        }
    }

    public static class RandStringGenerator implements Generator {
        private int len;

        private RandCharGenerator cg = new RandCharGenerator();

        public RandStringGenerator(int length) {
            len = length;
        }

        public Object next() {
            char[] buf = new char[len];
            for (int i = 0; i < len; i++)
                buf[i] = cg.next();
            return new String(buf);
        }
    }

}