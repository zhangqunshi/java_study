class MonthTest {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        if (m == Month.JAN) {
            System.out.println("This is Winter");
        } else if (m == Month.FEB) {
            System.out.println("This is Winter");
        } else if (m == Month.MAR) {
            System.out.println("This is Spring");
        } else if (m == Month.APR) {
            System.out.println("Spring");
        } else if (m == Month.MAY) {
            System.out.println("Summer");
        }
    }
}