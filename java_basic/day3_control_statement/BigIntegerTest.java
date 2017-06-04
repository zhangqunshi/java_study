import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("999999999999999999999");
        BigInteger b = new BigInteger("999999999999999999999");

        BigInteger c = a.add(b);

        System.out.println("c=" + c);
    }

}
