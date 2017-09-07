import java.util.concurrent.*;
import java.util.*;

public class Pool<T> {
    private int size;
    private List<T> items = new ArrayList<T>();
    private volatile boolean[] checkout;
    private Semaphore available;

    public Pool(Class<T> classObject, int size) {
        this.size = size;
        checkout = new boolean[size];
        available = new Semaphore(size, true);

        for (int i = 0; i < size; i++) {
            try {
                items.add(classObject.newInstance());
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        System.out.println("==> " + items);
    }


    public T checkout() throws InterruptedException {
        available.acquire();
        return getItem();
    }

    public void checkin(T x) {
        if (releaseItem(x)) {
            available.release();
        }
    }

    private synchronized T getItem() {
        for (int i = 0; i < size; i++) {
            if (!checkout[i]) {
                checkout[i] = true;
                return items.get(i);
            }
            
        }
        return null;
    }

    private synchronized boolean releaseItem(T item) {
        int index = items.indexOf(item);
        if (index == -1) return false;
        if (checkout[index]) {
            checkout[index] = false;
            return true;
        }
        return false;
    }



}