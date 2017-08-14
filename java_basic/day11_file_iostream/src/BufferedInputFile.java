import java.io.*;

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        FileReader in = new FileReader(filename);
        int x = 0;
        StringBuilder sb = new StringBuilder();
        while ((x = in.read()) != -1) {
            char w = (char)x;
            sb.append(w);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}
