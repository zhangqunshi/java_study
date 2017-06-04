/*
 * AutoBoxTest.java
 * 
 * Created on 2007-11-30, 9:37:10
 */

package com.nastation.c19.test;

import java.util.ArrayList;

/**
 * AutoBox之前的代码的例子
 * @author who
 */
public class AutoBoxTest implements IAutoBox {
    
    ArrayList list;
    int size;
    
    AutoBoxTest(int i) {
        list = new ArrayList();
        size  = i;
    }
    
    public void fill() {
        for (int i = 0; i < size; i++) {
            list.add(new Integer(i));
        }
    }
    
    public void increment() {
        for (int i = 0; i < size; i++) {
            Integer x = (Integer) list.get(i);
            int y = x.intValue() + 1;
            list.set(i, new Integer(y));
        }

    }
    
    public void print() {
        for (int i = 0; i < size; i++) {
            Integer x = (Integer)list.get(i);
            System.out.println(i + "=" + x);
        }
    }
    
    public Integer add(Integer x, int y) {
//        return x.intValue() + y;
        return x + y;
    }
}
