import java.nio.*;

public class ViewBuffers {

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[] {0,0,0,0,0,0,0,'a'});
        bb.rewind();
        System.out.print("Byte buffer ");
        while(bb.hasRemaining()) {
            System.out.print(bb.position() + "->" + bb.get() + ", ");
        }
        System.out.println();

        CharBuffer cb = ((ByteBuffer) bb.rewind()).asCharBuffer();
        System.out.print("Char buffer ");
        while(cb.hasRemaining()) {
            System.out.print(cb.position() + "->" + cb.get() + ", ");
        }
        System.out.println();

        FloatBuffer fb = ((ByteBuffer) bb.rewind()).asFloatBuffer();
        System.out.print("Float buffer ");
        while(fb.hasRemaining()) {
            System.out.print(fb.position() + "->" + fb.get() + ", ");
        }
        System.out.println();
    }
}
