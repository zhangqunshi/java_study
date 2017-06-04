/**
 * @(#)FileTest.java
 * @author Kris
 * @version 1.00 2008/3/11
 */

import java.io.File;

public class DeleteDir {

    public static void main(String[] args) {
        File dir = new File("c:\\\\java\\test");
        boolean b = dir.delete();
        System.out.println("ɾ��Ŀ¼=" + b);
    }
}