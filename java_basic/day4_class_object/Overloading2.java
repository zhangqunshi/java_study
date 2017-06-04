class Tree2 {
    Tree2(int height) {
        prt("Tree is " + height + " feet tall");
    }

    Tree2(String height) {
        prt("Tree is " + height + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

public class Overloading2 {
    public static void main(String[] args) {
        new Tree2(2);
        new Tree2("2");
    }
}