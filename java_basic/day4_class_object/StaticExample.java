
public class StaticExample {

    void print() {
        System.out.println("print me!");
    }

    static void print2() {
        System.out.println("print me2!");
    }

    public static void main(String[] args) {
        StaticExample se = new StaticExample();
        se.print();

        se.print2();
        print2();

        //StaticExample.print2();
    }

}

class StaticExampleTest {
    public static void main(String[] args) {
        StaticExample.print2();
    }
}
