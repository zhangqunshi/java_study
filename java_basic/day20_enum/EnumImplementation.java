import java.util.*;

interface Generator<T> {
    public T next();
}

enum CartoonCharacter implements Generator<CartoonCharacter> {
    A, B, C, D, E, F;

    private Random random = new Random(47);

    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}

public class EnumImplementation {

    public static <T> void printNext(Generator<T> g) {
        System.out.print(g.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.A;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }

}
