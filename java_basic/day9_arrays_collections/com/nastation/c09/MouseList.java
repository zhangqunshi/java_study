package com.nastation.c09;

import java.util.ArrayList;

public class MouseList {

    private ArrayList list = new ArrayList();

    public void add(Mouse m) {
        list.add(m);
    }

    public Mouse get(int index) {
        return (Mouse) list.get(index);
    }

    public int size() {
        return list.size();
    }
}