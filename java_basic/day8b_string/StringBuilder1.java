
public class StringBuilder1 {

  public static void main(String[] args) {
    String q = "hello" + "world";
    System.out.println(q);

    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    sb.append("world");
    System.out.println(sb.toString());
  }
}
