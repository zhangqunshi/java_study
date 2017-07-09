import java.util.*;

public class Queue1 {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }

        printQ(queue);

    }
}