/**
 * 右值可以是任何常数变量或者表达式，只要能产生一个值就行。
 * 但左值必须是一个明确的已命名的变量。
 *
 * @author Kris
 * @version 2007-1-8
 */
class Assignment2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 9;
        a = 4;
        int c = a + b;

        int d;
        d = c + b;

        prt("a=" + a);
        prt("d=" + d);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}