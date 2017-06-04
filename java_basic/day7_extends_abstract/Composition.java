class A {
    int a;
    int b;

    A(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }
}

class B {
    int a;
    int b;

    B(int x, int y) {
        a = x;
        b = y;
    }

    int sub() {
        return a - b;
    }
}


class Calculator {
    A a;
    B b;

    Calculator(int x, int y) {
        a = new A(x, y);
        b = new B(x, y);
    }


    void printResult() {
        System.out.println("a+b=" + a.add());
        System.out.println("a-b=" + b.sub());
    }
}

class Test {
    public static void main(String[] args) {
        new Calculator(10, 3).printResult();
    }
}