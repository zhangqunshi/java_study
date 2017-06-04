package com.nastation.c07;

//: c07:Sandwich.java
//Order of constructor calls.

/**
 * 构造函数的调用顺序
 */
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

/**
 * 构造函数的调用遵照下面的顺序:
 * (1) 调用基类构造函数这个步骤会不断重复下去首先构建的是分级结构的根部,
 * 然后是下一个派生类等等直至走得最远的一级派生类
 * (2) 按声明顺序调用成员初始化模块
 * (3) 调用派生构造函数主体
 *
 * @author kris
 */
class Sandwich extends PortableLunch {
    Bread b = new Bread();

    Cheese c = new Cheese();

    Lettuce l = new Lettuce();

    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}