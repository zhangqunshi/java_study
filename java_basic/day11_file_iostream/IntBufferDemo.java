import java.nio.*;

public class IntBufferDemo {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(1024);
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[] {11, 42, 35, 22, 33, 55});
        System.out.println(ib.get(3));
        ib.put(3, 1181);

        ib.flip();
        while (ib.hasRemaining()) {
            int i = ib.get();
            System.out.println(i);
        }
    }
}
