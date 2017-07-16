import java.util.*;

class MyClass implements Iterable<String> {

    private String[] arr = new String[]  {
        "Hello", "Kris", "Hi"
    };

    private String[] arr2 = new String[]  {
        "Hello2", "Kris2", "Hi2"
    };

    @Override
    public Iterator<String> iterator() {
        // return new Iterator<String>() {
        //     private int idx = 0;
        //     public boolean hasNext() {
        //         return idx < arr2.length + arr.length;
        //     }
        //     public String next() {
        //         if (idx < arr.length) {
        //             return arr[idx++];
        //         } else {
        //             return arr2[idx++ - arr.length];
        //         }
        //     }

        //     public void remove() {
        //         throw new UnsupportedOperationException();
        //     }
        // };

        return new Iterator<String>() {
            private int idx = 0;
            public boolean hasNext() {
                return idx < 10;
            }
            public String next() {
                return String.valueOf(idx++);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class Foreach2 {
    public static void main(String[] args) {
        MyClass x = new MyClass();
        for (String s : x) {
            System.out.println(s);
        }
    }
}