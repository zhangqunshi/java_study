import java.io.*;

public class BufferedInputFile2 {
    public static String read(String filename) throws IOException {
        FileReader in = new FileReader(filename);
        int x = 0;
        char[] buff = new char[1024];
        StringBuilder sb = new StringBuilder();
        while ((x = in.read(buff)) != -1) {
            for (int i = 0; i < x; i++) {
                sb.append(buff[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}
