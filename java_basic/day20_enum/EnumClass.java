
enum Shrubbery {
  GROUND,
  CRAWLING,
  HANGING
}

public class EnumClass {

    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.print(s.ordinal() + " ");
            System.out.print(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.print(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.print((s == Shrubbery.CRAWLING) + " ");
            System.out.print(s.getDeclaringClass() + " ");
            System.out.println(s.name());
        }

        for (String s : "GROUND CRAWLING HANGING".split(" ")) {
            Shrubbery x = Enum.valueOf(Shrubbery.class, s);
            System.out.println(x);
        }
    }

}
