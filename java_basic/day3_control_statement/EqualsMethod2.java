class Value {
    int i;
//    public boolean equals(Object obj) {
//        Value v = (Value)obj;
//        return (this.i == v.i);   
//    }     
}

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
} ///:~