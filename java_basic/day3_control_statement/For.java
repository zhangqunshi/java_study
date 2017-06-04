class For {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 0; i <= 10; i++, j++) {
            System.out.println(i + j);
        }

        for (; ; ) {
        }
    }
}