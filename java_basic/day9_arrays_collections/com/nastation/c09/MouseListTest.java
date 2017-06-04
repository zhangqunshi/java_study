package com.nastation.c09;

public class MouseListTest {

    public static void main(String[] args) {

        MouseList mice = new MouseList();

        for (int i = 0; i < 3; i++) {
            mice.add(new Mouse(i));
        }

        for (int i = 0; i < mice.size(); i++) {
            MouseTrap.caughtYa(mice.get(i));
        }
    }
}