public class GenericMethods {

    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('a');
        gm.f(gm);
    }
}