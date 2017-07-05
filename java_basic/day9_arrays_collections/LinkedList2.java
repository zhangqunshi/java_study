import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }

        for (Integer x : list) {
            System.out.println(x);
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        // list2.element();  // java.util.NoSuchElementException
        // list2.getFirst();  // java.util.NoSuchElementException
        Integer i = list2.peek();
        System.out.println(i);
        // list2.removeFirst();
        // list2.remove();
        Integer j = list2.poll();
        System.out.println(j);

    }

}