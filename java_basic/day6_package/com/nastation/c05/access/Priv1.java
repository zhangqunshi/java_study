package com.nastation.c05.access;

class Priv1 {
    private void print() {
        System.out.println("Priv1");
    }

    protected void print2() {
        System.out.println("Print2");
    }
}

class Priv2 // extends Priv1
{
    Priv2() {
        new Priv1().print2();
    }
}

class TestPriv {
    public static void main(String[] args) {
        //new Priv1().print();
        new Priv2();
    }
}
