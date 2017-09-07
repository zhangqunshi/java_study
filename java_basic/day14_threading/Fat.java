public class Fat {
    private volatile double d;
    private static int counter = 0;
    private final int id = counter++;

    public Fat() {
        for (int i = 0; i < 10; i++) {
            d += (Math.PI + Math.E) / (double)i;
        }
    }

    public void operation() { System.out.println(this); }
    public String toString() {
        return "Fat id: " + this.id;
    }
}