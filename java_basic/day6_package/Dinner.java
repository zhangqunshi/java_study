

import com.nastation.c05.Cookie;

public class Dinner {
    public Dinner() {
        System.out.println("Dinner constructor");
    }

    public static void main(String[] args) {
        Cookie x = new Cookie();
        // x.bite(); // Can't access
        x.bite3();
    }
}