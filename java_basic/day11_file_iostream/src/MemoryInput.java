import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        // StringReader in = new StringReader("hello, kris");
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }

    }
}
