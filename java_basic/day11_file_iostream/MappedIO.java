import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import java.util.*;

public class MappedIO {
    static int numOfInts = 4000000;
    static int numOfUbuffInts = 200000;

    public static abstract class Tester {
        private String name;
        public Tester(String name) { this.name = name;}
        public void runTest() {
            try {
                System.out.println(name);
                long start = System.nanoTime();
                test();
                double duration = System.nanoTime() - start;
                System.out.format("%.2f\n", duration/1.0e9);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        public abstract void test() throws IOException;
    }

    private static Tester[] tests = {
        new Tester("Stream Write") {
            public void test() throws IOException {
                DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("temp.tmp"))));
                for (int i = 0; i < numOfInts; i++) {
                    dos.writeInt(i);
                }
                dos.close();
            }
        },
        new Tester("Mapped Write") {
            public void test() throws IOException {
                FileChannel fc = new RandomAccessFile("temp.tmp", "rw").getChannel();
                IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
                for (int i = 0; i < numOfInts; i++) {
                    ib.put(i);
                }
                fc.close();
            }
        },
        new Tester("Stream Read") {
            public void test() throws IOException {
                DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("temp.tmp"))));
                for (int i = 0; i < numOfInts; i++) {
                    dis.readInt();
                }
                dis.close();
            }
        },
        new Tester("Mapped Read") {
            public void test() throws IOException {
                FileChannel fc = new FileInputStream("temp.tmp").getChannel();
                IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).asIntBuffer();
                for (int i = 0; i < numOfInts; i++) {
                    ib.get();
                }
                fc.close();
            }
        },
        new Tester("Stream Read/Write") {
            public void test() throws IOException {
                RandomAccessFile raf = new RandomAccessFile("temp.tmp", "rw");
                raf.writeInt(1);
                for (int i = 0; i < numOfUbuffInts; i++) {
                    raf.seek(raf.length() - 4);
                    raf.writeInt(raf.readInt());
                }
            }
        },
        new Tester("Mapped Read/Write") {
            public void test() throws IOException {
                FileChannel fc = new RandomAccessFile("temp.tmp", "rw").getChannel();
                IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
                ib.put(0);
                for (int i = 1; i < numOfInts; i++) {
                    ib.put(ib.get(i - 1));
                }
                fc.close();
            }
        }
    };

    public static void main(String[] args) throws Exception {
        for (Tester t : tests) {
            t.runTest();
        }
    }
}
