/**
 * 演示Switch的用法
 *
 * @author Kris
 * @version 2008-1-9 16:05
 */
class Switch2 {

    public static void main(String[] args) {
        char c = 'a';

        switch (c) {
            case 'a':
                System.out.println("Your select is a");
                break;
            case 'b':
                System.out.println("Your select is b");
                break;
            case 'c':
                System.out.println("Your select is c");
                break;
            //...
            default:
                System.out.println("Your select is wrong");
        }
    }
}