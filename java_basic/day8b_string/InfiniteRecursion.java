
public class InfiniteRecursion {

  @Override
  public String toString() {
    return "InfiniteRecursion " + this + "\n";
  }

  public static void main(String[] args) {
    System.out.println(new InfiniteRecursion());
  }
}
