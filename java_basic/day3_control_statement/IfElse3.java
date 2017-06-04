public class IfElse3 {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 4;

        if (a > b) {
            if (a > c) {
                System.out.println("a is biggest");
            } else {
                System.out.println("c is biggest");
            }
        } else {
            if (b > c) {
                System.out.println("b is biggest");
            } else {
                System.out.println("c is biggest");
            }
        }
    }
}