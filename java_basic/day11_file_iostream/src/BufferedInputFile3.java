import java.io.*;

public class BufferedInputFile3 {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String x = null;
        while ((x = in.readLine()) != null) {
            sb.append(x).append("\n");
        }
        in.close();

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}
