import java.util.*;

public class Queue2 {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(10);
        queue.offer(4);
        queue.offer(8);
        queue.offer(3);

        printQ(queue);

    }
}