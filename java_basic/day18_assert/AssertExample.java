public class AssertExample { 
  public static void main(String[] args) {
    int x = 10;
    if (args.length > 0) {
      x = Integer.parseInt(args[0]);
    }

    System.out.println("Testing assertion: x==10 " + x);
    assert x == 10 : "Test failed";
    System.out.println("Test passed");
  }
}