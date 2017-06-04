/**
 * @(#)FileTest.java
 * @author Kris
 * @version 1.00 2008/3/11
 */

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {
        File f = new File("c:\\\\java\\kris.test");
        try {
            boolean b = f.createNewFile();
            System.out.println("success=" + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}