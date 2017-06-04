/*
 * ForTest.java
 *
 * Created on 2007-11-30, 14:13:14
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nastation.c19.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author who
 */
public class ForTest {

    static void arrayFor() {
        int[] a = new int[10];
        Arrays.fill(a, 7);

//        for (int idx = 0; idx < a.length; idx++) {
//            System.out.println("a[" + idx + "]=" + a[idx]);
//        }
        for (int x : a) {
            System.out.println(x);
        }
    }

    static void listFor() {
        ArrayList list = new ArrayList();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);

        for (Object x : list) {
            System.out.println(x);
        }
    }

    static void array2For() {
        int[][] a = new int[][]{
            {1, 2}, 
            {3, 4}
        };

        for (int[] x : a) {
//            for (int i = 0; i < x.length ; i++) {
//                
//                int k = x[i];
//                System.out.println(k);
////                Integer it = new Integer(k);
////                Object obj = (Object)it;
////                System.out.println(obj);
//            }
            for (int y : x) {
                System.out.println(y);
            }
        }
    }

    public static void main(String[] args) {
//        listFor();
        array2For();
    }
}