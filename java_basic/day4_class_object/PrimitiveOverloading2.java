//: c04:PrimitiveOverloading.java
// Promotion of primitives and overloading.

public class PrimitiveOverloading2 {

//    void f1 (int x) {
//		System.out.println("f1 int");
//	}

    void f1(int x) {
        System.out.println("f1");
    }


    public static void main(String[] args) {
        long a = 9l;

        PrimitiveOverloading2 p = new PrimitiveOverloading2();
        p.f1((int) a);

    }
} 
