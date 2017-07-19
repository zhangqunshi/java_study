public class GetChars {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "helloworldkrisabcd";
        char[] x = new char[100];
        str.getChars(2, 8, x, 3);

        for (char y : x) {
          System.out.print(y + ",");
        }

    }

}
