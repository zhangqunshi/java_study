package com.nastation.c07;

/**
 * 前一节讲述的初始化顺序并不十分完整那正是关键之所在初始化的实际过程是这样的:
 * (1) 在采取其他任何操作之前, 为对象分配的存储空间初始化成二进制0
 * (2) 就象前面叙述的那样, 调用基类构造函数. 此时被覆盖的draw()方法会得到调用
 * (的确是在RoundGlyph 构造函数调用之前). 此时会发现radius 的值为0, 这是由于步骤(1)造成的
 * (3) 按照原先声明的顺序调用成员初始化代码
 * (4) 调用派生类构造函数的主体
 *
 * @author kris
 */
abstract class Glyph {
    abstract void draw();

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
