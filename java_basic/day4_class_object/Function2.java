/**
 * Created by kris on 2017/6/4.
 */
public class Function2 {

    // 引用拷贝，指向同一个地址
    public void func(int[] a) {
        System.out.println("line 7= " + a[0]);
        a[0] = 10;
        System.out.println("line 9= " + a[0]);
    }


    public static void main(String[] args) {
        int[] a = new int[1];
        a[0] = 5;

        Function2 f = new Function2();
        f.func(a);

        System.out.println("line 18=" + a[0]);
    }
}
