import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import java.util.concurrent.*;

public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(new File("file.txt"));
        FileLock fl = fos.getChannel().tryLock();
        if (fl != null) {
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("Released File");
        } else {
            System.out.println("Other program locked this file!");
        }
        fos.close();
    }
}
