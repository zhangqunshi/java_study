//: c04:SimpleConstructor.java
// Demonstration of a simple constructor.

/**
 * 用构造函数自动初始化
 */
class Rock {
    Rock() {
        System.out.println("Creating Rock");
    }
}

public class SimpleConstructor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a = 10;
            //Rock r = new Rock();
            new Rock();
        }
    }
}