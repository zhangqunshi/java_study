package com.nastation.c09;

import java.util.Map;

public class MPair implements Map.Entry, Comparable {
    Object key, value;

    MPair(Object k, Object v) {
        key = k;
        value = v;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(Object v) {
        Object result = value;
        value = v;
        return result;
    }

    public boolean equals(Object o) {
        return key.equals(((MPair) o).key);
    }

    public int compareTo(Object rv) {
        return ((Comparable) key).compareTo(((MPair) rv).key);
    }
}