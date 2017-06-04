//: c09:FillingLists.java
// The Collections.fill() method.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingLists {

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("");
        }
        Collections.fill(list, "Hello");
        System.out.println(list);
    }
}