import java.nio.*;
import java.util.*;

public class UsingBuffers {
    public static void symmetricScramble(CharBuffer cb) {
        while (cb.hasRemaining()) {
            cb.mark();
            char x = cb.get();
            char y = cb.get();
            cb.reset();
            cb.put(y).put(x);
        }
    }

    public static void main(String[] args) {
        char[] x = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(x.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(x);

        symmetricScramble(cb);
        System.out.println(cb.rewind());
        symmetricScramble(cb);
        System.out.println(cb.rewind());
    }
}
