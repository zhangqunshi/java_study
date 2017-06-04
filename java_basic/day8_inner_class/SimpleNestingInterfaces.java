/**
 * Ƕ�׽ӿ�
 *
 * @author kris
 */
interface A {
    interface B {
    }
}

class C {
    interface D {
    }

    class H implements D {
    }
}

interface E {
    class F {
        static void print() {
            System.out.println("E.F.print()");
        }
    }

    F f = new F();

    class G extends F {
    }
}

public class SimpleNestingInterfaces {

    public static void main(String[] args) {
        E.f.print();
        //E.f = new E.F();
    }
}

