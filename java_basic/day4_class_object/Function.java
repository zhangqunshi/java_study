/**
 * Created by kris on 2017/6/4.
 */
public class Function {

    // 值拷贝
    public void func(int a) {
        System.out.println("line 7= " + a);
        a = 10;
        System.out.println("line 9= " + a);
    }


    public static void main(String[] args) {
        int a = 5;

        Function f = new Function();
        f.func(a);

        System.out.println("line 18=" + a);
    }
}
