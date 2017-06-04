//: c04:SimpleConstructor.java
// Demonstration of a simple constructor.

/**
 * 用构造函数自动初始化
 */
class Rock2 {
    Rock2() {
    }

    Rock2(int i) {
        System.out.println("Creating Rock " + i);
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}