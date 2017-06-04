import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            pq.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(pq);
    }
}