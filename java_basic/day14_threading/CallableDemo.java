import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (Exception e) {

        }
        
        return "result of TaskWithResult: " + this.id;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        for (int i = 0; i < 10; i++) {
            results.add(es.submit(new TaskWithResult(i)));
        }

        for (Future<String> f : results) {
            System.out.println(f.get());
        }

        es.shutdown();
    }
}