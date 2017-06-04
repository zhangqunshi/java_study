//: c03:Equivalence.java

/**
 * 判断相等
 *
 * @author Kris
 * @version 0.1   2007.8.14  15:14
 */
public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        Integer n3 = n2;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n3 == n2);
    }
} 