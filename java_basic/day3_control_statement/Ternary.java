public class Ternary {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(20));
    }
}