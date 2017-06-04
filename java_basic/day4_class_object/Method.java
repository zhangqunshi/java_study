/**
 * 方法介绍
 *
 * @author Kris
 * @version 2008-1-10 9:24
 */
class Method {

    /**
     * 加法
     *
     * @param a
     * @param b
     * @return a + b
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * 减法
     *
     * @param a
     * @param b
     * @return a - b
     */
    static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        System.out.println("result=" + add(x, y));
        int r = sub(x, y);
        System.out.println("r=" + r);
    }
}