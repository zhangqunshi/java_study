class Literals {

    static char c = 0xffff; // max char hex value
    static byte b = 0x7f; // max byte hex value
    static short s = 0x7fff; // max short 	hex value
    static int i1 = 0x2f; // Hexadecimal (lowercase)
    int i2 = 0X2F; // Hexadecimal (uppercase)
    int i3 = 0177; // Octal (leading zero)
    // Hex and Oct also work with long.
    long n1 = 200L; // long suffix
    long n2 = 200l; // long suffix
    long n3 = 200;
    //! long l6(200); // not allowed
    float f1 = 1;
    float f2 = 1F; // float suffix
    float f3 = 1f; // float suffix
    static float f4 = 1e-45f; // 10 to the power
    static float f5 = 1e+9f; // float suffix
    double d1 = 1d; // double suffix
    double d2 = 1D; // double suffix
    static double d3 = 47e47d; // 10 to the power

    public static void main(String[] args) {
        System.out.println("c=" + c);
        System.out.println("b=" + b);
        System.out.println("s=" + s);
        System.out.println("i1=" + i1);
        System.out.println("f4=" + f4);
        System.out.println("f5=" + f5);
        System.out.println("d3=" + d3);
    }
}