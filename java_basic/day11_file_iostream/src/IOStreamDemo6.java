import java.io.*;

public class IOStreamDemo6 {

    public static void main(String[] args) throws IOException {

        String s2 = "i am kris zhang\nThis is two!";

        try {
            BufferedReader in4 = new BufferedReader(new StringReader(s2));

            PrintWriter out1 = new PrintWriter(new BufferedWriter(
                    new FileWriter("IODemo.out")));

            int lineCount = 1;
            String s = null;

            while ((s = in4.readLine()) != null) {
                out1.println(lineCount + ": " + s);
                lineCount++;
            }
            out1.close();
            in4.close();
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}