/**
 * Test SimpleBean
 */
public class TestJavaBean2 {


    public void printBeans(SimpleBean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            SimpleBean s = arr[i];
            System.out.println("age=" + s.getAge());
            System.out.println("name=" + s.getName());
        }
    }


    public static void main(String[] args) {
        SimpleBean[] arr = new SimpleBean[10];

        for (int i = 0; i < 10; i++) {
            SimpleBean sb = new SimpleBean();
            sb.setAge(i);
            sb.setName("kris" + i);

            arr[i] = sb;
        }

        TestJavaBean2 t = new TestJavaBean2();
        t.printBeans(arr);
    }
}
