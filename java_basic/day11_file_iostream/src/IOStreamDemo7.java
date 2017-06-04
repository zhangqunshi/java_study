import java.io.*;

public class IOStreamDemo7 {

    public static void main(String[] args) {
        try {
            //д�����ݵ��ļ���
            DataOutputStream out2 = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream("Data.txt")));
            out2.writeDouble(3.14159);
            out2.writeChars("That was pi\n");
            out2.writeBytes("That was pi\n");
            out2.close();

            //��ȡ�ļ��е�����
            DataInputStream in5 = new DataInputStream(new BufferedInputStream(
                    new FileInputStream("Data.txt")));

            BufferedReader in5br = new BufferedReader(new InputStreamReader(in5));

            // Must use DataInputStream for data:
            System.out.println(in5.readDouble());

            // Can now use the "proper" readLine():
            System.out.println(in5br.readLine());

            // But the line comes out funny.
            // The one created with writeBytes is OK:
            System.out.println(in5br.readLine());

        } catch (EOFException e) {
            System.err.println("End of stream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}