import java.util.ArrayList;
import java.util.List;

/**
 * Test SimpleBean
 */
public class TestJavaBean {


    public void printBean(SimpleBean s, ComplexBean c) {
        System.out.println("age=" + s.getAge());
        System.out.println("name=" + s.getName());

        System.out.println("age=" + c.getAge());
        System.out.println("name=" + c.getName());

    }


    public void printBeans(List<SimpleBean> alist) {
        for (int i = 0; i < alist.size(); i++) {
            SimpleBean s = alist.get(i);
            System.out.println("age=" + s.getAge());
            System.out.println("name=" + s.getName());
        }
    }


    public static void main(String[] args) {
        SimpleBean a = new SimpleBean();
        a.setAge(100);
        a.setName("kris");

        ComplexBean b = new ComplexBean();
        b.setAge(100);
        b.setName("kris");

        TestJavaBean t = new TestJavaBean();
        t.printBean(a, b);

        List alist = new ArrayList();

        for (int i = 0; i < 10; i++) {
            SimpleBean sb = new SimpleBean();
            sb.setAge(i);
            sb.setName("kris" + i);

            alist.add(sb);
        }

        t.printBeans(alist);
    }
}
