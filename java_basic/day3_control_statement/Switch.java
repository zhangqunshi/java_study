/**
 * 演示Switch的用法
 *
 * @author Kris
 * @version 2008-1-9 16:01
 */
class Switch {

    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            case 4:
                System.out.println("a = 4");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            //......
            default:
                System.out.println("a = ?");
        }
    }
}