import java.util.ArrayList;

class Parent {
}

class A extends Parent {
}

class B {
}

public class InstanceOfExample {

    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.add(new A());
        list.add(new B());
        list.add(new A());
        list.add(new A());

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Parent) {
                System.out.println("I got a A instance");
            }
            if (obj instanceof B) {
                System.out.println("I got a B instance");
            }
        }
    }
}