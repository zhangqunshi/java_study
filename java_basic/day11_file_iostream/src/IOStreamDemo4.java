import java.io.IOException;
import java.io.StringReader;

public class IOStreamDemo4 {

    public static void main(String[] args) throws IOException {

        String s2 = "I am Kris Zhang!����";

        StringReader in2 = new StringReader(s2);
        int c;
        while ((c = in2.read()) != -1) {
            System.out.print((char) c);
        }
    }
}