public class BreakAndContinue3 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            if (i == 7) {
                //break;
                continue;
            }
            System.out.println(i);
        }

    }
}