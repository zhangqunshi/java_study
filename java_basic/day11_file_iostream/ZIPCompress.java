import java.io.*;
import java.util.zip.*;
import java.util.*;

public class ZIPCompress {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(out, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream bos = new BufferedOutputStream(zos);

        String[] files = {"ZIPCompress.java", "GZIPCompress.java"};
        for (String file : files) {
            System.out.println("Write file: " + file);
            zos.putNextEntry(new ZipEntry(file));
            BufferedReader br = new BufferedReader(new FileReader(file));
            int x = 0;
            while ((x = br.read()) != -1) {
                bos.write(x);
            }
            br.close();
            bos.flush();
        }
        bos.close();

        System.out.println("Checksum: " + csum.getChecksum().getValue());

        System.out.println("Read file");
        FileInputStream in = new FileInputStream("test.zip");
        CheckedInputStream csumi = new CheckedInputStream(in, new Adler32());
        ZipInputStream zis = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(zis);

        ZipEntry ze = null;
        while((ze = zis.getNextEntry()) != null) {
            System.out.println("Read file: " + ze);
            System.out.println("Read file: " + ze.getName());
            int x = -1;
            while ((x = bis.read()) != -1) {
                System.out.write(x);
            }
        }
        System.out.println(csumi.getChecksum().getValue());
        bis.close();

        ZipFile zf = new ZipFile("test.zip");
        Enumeration e = zf.entries();
        while (e.hasMoreElements()) {
            ZipEntry ze2 = (ZipEntry) e.nextElement();
            System.out.println("File: " + ze2);
        }
    }
}
