
class Tree4 {

    Tree4(int height) {
        prt("Tree is " + height + " feet tall");
    }

    Tree4(int height, int b) {
        prt("Tree is " + height + b + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

public class Overloading3 {
    public static void main(String[] args) {
        new Tree4(2);
        new Tree4(2, 3);
    }
}