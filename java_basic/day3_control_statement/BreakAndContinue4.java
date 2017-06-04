public class BreakAndContinue4 {

    public static void main(String[] args) {

        int i = 0;
        do {
            i++;
            System.out.println(i);
            //break;
            if (i == 3) {
                continue;
            }
            System.out.println("hello");
        } while (i < 9);

    }
}