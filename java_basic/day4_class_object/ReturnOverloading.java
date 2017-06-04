
public class ReturnOverloading {

    static void f(int a) {
        //static void f() {
        System.out.println("return void");
    }

    static int f() {
        System.out.println("return 0");
        return 0;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        f();
    }

}
