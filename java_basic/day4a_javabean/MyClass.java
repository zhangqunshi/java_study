/**
 * 自定义类: 需要通过关键字class来定义。
 * <p>
 * 类中包括属性和方法（包括构造方法）两个主要部分。
 */
public class MyClass {

    String name;
    int age;

    /**
     * 构造方法：与类名必须相同，没有返回值
     */
    public MyClass() {
        this.name = "kris";
        this.age = 10;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}