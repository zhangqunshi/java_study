import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class IOStreamDemo5 {

    public static void main(String[] args) {

        String s2 = "����This is kris zhang";

        try {
            DataInputStream in3 = new DataInputStream(new ByteArrayInputStream(s2.getBytes()));
            while (true) {
                System.out.println((char) in3.readByte());
            }

			/*
			ByteArrayInputStream in3 = new ByteArrayInputStream(s2.getBytes());
			int c;
			while ((c=in3.read()) != -1) {
				System.out.println((char)c);
		    }
		    */
        } catch (Exception e) {
            System.err.println("End of stream");
        }
    }
}