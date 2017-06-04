import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �Ӽ��̵õ�����
 */
public class IOStreamDemo3 {

    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line:");

        System.out.println(stdin.readLine());
        stdin.close();
    }
}