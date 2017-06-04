package com.nastation.c07;

class Shape {
    void draw() {
    }

    void erase() {
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }

    void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }

    void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }

    void erase() {
        System.out.println("Triangle.erase()");
    }
}

//class A extends Shape {
//	void draw() {
//		System.out.println("A.draw()");
//	}
//	void erase() {
//		System.out.println("A.erase()");
//	}
//}

/**
 * 对draw()的所有调用都是通过动态绑定进行的
 * Shape s = new Circle();
 *
 * @author kris
 */
public class Shapes {

    public static Shape randShape() {
        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
//		case 3:
//			return new A();
        }
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++) {
            s[i] = randShape();
        }
        // Make polymorphic method calls:
        for (int i = 0; i < s.length; i++) {
            s[i].draw();
        }
    }
}