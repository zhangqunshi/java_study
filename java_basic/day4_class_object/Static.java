public class Static {

    int a = 0;
    static int b = 1;

    static void print() {
        System.out.println("Hello");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Static obj = new Static();
        obj.a = 4;
        b = 10;
        print();
    }

}
