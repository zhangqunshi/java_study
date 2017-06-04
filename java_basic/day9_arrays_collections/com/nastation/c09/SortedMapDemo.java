package com.nastation.c09;

import java.util.Iterator;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        TreeMap sortedMap = new TreeMap();
        Collections2.fill(sortedMap, SimplePairGenerator.gen, 10);
        System.out.println(sortedMap);

        Object low = sortedMap.firstKey(), high = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(high);

        Iterator it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3)
                low = it.next();
            if (i == 6)
                high = it.next();
            else
                it.next();
        }
        System.out.println(low);
        System.out.println(high);

        System.out.println(sortedMap.subMap(low, high));
        System.out.println(sortedMap.headMap(high));
        System.out.println(sortedMap.tailMap(low));

    }
}