class ThisExample {

    int x;
    char y;

    ThisExample(int w) {
        System.out.println("hello" + w);
    }

    ThisExample(int x, char y) {
        this(x);
        this.x = x;
        this.y = y;
    }

    public void sayHello() {
        System.out.println("hi");
    }

    public void sayHello2() {
        this.sayHello();
        sayHello();
        System.out.println("hi");
    }

    public String toString() {
        return this.x + " " + y;
    }

    public static void main(String[] args) {
        ThisExample c = new ThisExample(8, 'h');
        System.out.println(c.toString());
    }
}