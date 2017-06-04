class Cast2 {
    public static void main(String[] args) {
        float i = 200.12f;
        double d = i + 1.5;

        int a = 10;
        long b = 4;
        System.out.println(a + b);

        short s1 = 3;
        short s2 = 4;
        short s3 = (short) (s1 + s2);

        System.out.println("s3 = " + s3);
    }
}