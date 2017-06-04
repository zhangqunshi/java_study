
class MyClass {

}

public class InstanceofTest {

    public static void main(String[] args) {
        MyClass c = new MyClass();

        if (c instanceof MyClass) {
            System.out.println("i am MyClass");
        }

        System.out.println(MyClass.class.toString());
    }
}
