import java.io.*;
import java.util.zip.*;

public class GZIPCompress {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("GZIPCompress.java"));
        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
        int x = 0;
        while ((x = br.read()) != -1) {
            out.write(x);
        }
        br.close();
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
        String line = null;
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
