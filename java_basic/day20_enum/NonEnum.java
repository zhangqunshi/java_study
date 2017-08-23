public class NonEnum {

    public static void main(String[] args) {
        Class x = Integer.class;
        for (Object y: x.getClass().getEnumConstants()) {
            System.out.println(y);
        }
    }

}
