/**
 * @(#)FileTest.java
 * @author Kris
 * @version 1.00 2008/3/11
 */

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        //c:\\java\test
        File f = new File("c:\\\\java\\test");
        boolean b = f.delete();
        System.out.println("ɾ���ļ�=" + b);
    }
}