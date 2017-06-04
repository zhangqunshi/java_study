package com.nastation.c09;

//: c09:SlowMap.java
//A Map implemented with ArrayLists.

import java.util.*;

public class SlowMap extends AbstractMap {

    private ArrayList keys = new ArrayList();
    private ArrayList values = new ArrayList();

    public Object put(Object key, Object value) {
        Object result = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return result;
    }

    public Object get(Object key) {
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

    public Set entrySet() {
        Set entries = new HashSet();
        Iterator ki = keys.iterator(), vi = values.iterator();
        while (ki.hasNext())
            entries.add(new MPair(ki.next(), vi.next()));
        return entries;
    }

    public static void main(String[] args) {
        SlowMap m = new SlowMap();
        Collections2.fill(m, Collections2.geography, 25);
        System.out.println(m);
    }
}