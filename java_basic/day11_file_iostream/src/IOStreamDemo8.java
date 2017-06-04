import java.io.IOException;
import java.io.RandomAccessFile;

public class IOStreamDemo8 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
        for (int i = 0; i < 10; i++) {
            rf.writeDouble(i * 2);
        }
        rf.close();

        rf = new RandomAccessFile("rtest.dat", "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();

        rf = new RandomAccessFile("rtest.dat", "r");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value " + i + ": " + rf.readDouble());
        }
        rf.close();
    }
}