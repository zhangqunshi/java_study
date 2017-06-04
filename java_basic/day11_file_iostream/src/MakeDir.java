/**
 * @(#)FileTest.java
 * @author Kris
 * @version 1.00 2008/3/11
 */

import java.io.File;

public class MakeDir {

    public static void main(String[] args) {
        File f = new File("c:\\\\java\\test");
        boolean b = f.mkdir();
        f.mkdirs();
        System.out.println("success=" + b);

    }
}