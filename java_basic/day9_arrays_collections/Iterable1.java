import java.util.*;

public class Iterable1<T> extends ArrayList<T> {

    public Iterable1(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        // 反向遍历
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public T next() {
                        return get(current--);
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }

        };
    }

    public static void main(String[] args) {
        Iterable1 one = new Iterable1<>(Arrays.asList("hello, kris".split(",")));
        
        for (Object o : one) {
            System.out.println(o);
        }

        for (Object o : one.reversed()) {
            System.out.println(o);
        }
    }
}
