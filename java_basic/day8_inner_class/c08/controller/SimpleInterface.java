package c08.controller;

interface SuperMan {
    int a = 10;

    void sayHello();

    void sayGoodbye();
}

class BigSuperMan implements SuperMan {
    public void sayHello() {
        //a = 9;
        System.out.println("Hello" + a);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        SuperMan man = new BigSuperMan();
        //! man.a = 9;
        man.sayHello();
        man.sayGoodbye();
    }
}