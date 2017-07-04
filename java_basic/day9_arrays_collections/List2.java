class List2 {
    private Object[] x;
    private int size;

    public List2() {
        x = new Object[10];
    }

    public void add(Object o) {
        ensureCapacity();
        x[size++] = o;
    }

    private void ensureCapacity() {
        if (size == x.length - 1) {
            int new_len = x.length * 2;
            Object[] w = new Object[new_len];
            for (int i = 0; i < x.length; i++) {
                w[i] = x[i];
            }
        }

    }

    public static void main(String[] args) {
        List2 a = new List2();
        a.add("hello");
        a.add("hello");
        a.add("hello");
        a.add("hello");

    }

}