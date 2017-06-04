/*
 * AutoBoxTestMain.java
 * 
 * Created on 2007-11-30, 9:47:24
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nastation.c19.test;

/**
 *
 * @author who
 */
public class AutoBoxTestMain {
    
    public static void main(String[] args) {
        AutoBoxTest test = new AutoBoxTest(10);
        test.fill();
        test.increment();
        test.print();
        int x = test.add(10, 20);
        System.out.println("x=" + x);
    }

}
