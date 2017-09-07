import java.util.*;
import java.util.concurrent.*;

class CheckoutTask<T> implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private Pool<T> pool;

    public CheckoutTask(Pool<T> pool) {
        this.pool = pool;
    }

    public void run() {
        try {
            T item = pool.checkout();
            System.out.println(this + "check out " + item);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(this + "check in " + item);
            pool.checkin(item);
        } catch (InterruptedException e) {
            
        }
    }

    public String toString() {
        return "Thread " + id + " ";
    }
}

public class SemaphoreDemo {
    final static int SIZE = 25;
    public static void main(String[] args) throws Exception {
        final Pool<Fat> pool = new Pool<Fat>(Fat.class, SIZE);

        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < SIZE; i++) {
            es.execute(new CheckoutTask<Fat>(pool));
        }

        System.out.println("All checkouttasks created!");

        List<Fat> list = new ArrayList<Fat>();
        for (int i = 0; i < SIZE; i++) {
            Fat f = pool.checkout();
            System.out.println(i + ": main() thread checkout");
            f.operation();
            list.add(f);
        }

        Future<?> blocked = es.submit(new Runnable() {
            public void run() {
                try {
                    pool.checkout();
                } catch (Exception e) {

                }
                
            }
        });

        TimeUnit.SECONDS.sleep(2);

        blocked.cancel(true);

        System.out.println("checking in objects in " + list);

        for (Fat f : list) {
            pool.checkin(f);
        }
        for (Fat f : list) {
            pool.checkin(f);
        }

        es.shutdown();


    }
}