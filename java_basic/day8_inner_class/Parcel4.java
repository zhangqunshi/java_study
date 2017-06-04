//: c08:Parcel4.java
// Nesting a class within a method.

public class Parcel4 {

    public Destination dest(String s) {

        /**
         * �ڶ��������Ǹ�������֮�����ǲ�����
         * @author who
         */
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

//	class A {}
//	void print() {
//		A a = new A();
//		PDestination p = new PDestination();
//	}

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
}