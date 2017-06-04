public class Leaf {

    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    void print(int i) {
        System.out.println("i = " + i);
        i = i;
        System.out.println("this.i = " + this.i);
        this.i = i;
        System.out.println("this.i = " + this.i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
        x.print(5);
    }
}